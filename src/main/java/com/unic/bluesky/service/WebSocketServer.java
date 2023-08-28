package com.unic.bluesky.service;

import com.alibaba.fastjson.JSON;
import com.unic.bluesky.vo.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;


@ServerEndpoint("/webSocket/{username}")
@Component
public class WebSocketServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketServer.class);


    private static ConcurrentHashMap<String, Session> sessionPools = new ConcurrentHashMap<>();


    public static ConcurrentHashMap<String, Session> getSessionPools() {
        return sessionPools;
    }

    //发送消息
    public void sendMessage(Session session, String message) throws IOException {
        if (session != null) {
            synchronized (session) {
                LOGGER.info("发送数据：" + message);
                session.getBasicRemote().sendText(message);
            }
        }
    }

    //给指定用户发送信息
    public void sendInfo(String userName, String message) {
        Session session = sessionPools.get(userName);
        try {
            sendMessage(session, message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 群发消息
    public void broadcast(String message) {
        for (Session session : sessionPools.values()) {
            try {
                sendMessage(session, message);
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
        }
    }

    //建立连接成功调用
    @OnOpen
    public void onOpen(Session session, @PathParam(value = "username") String userName) {
        sessionPools.put(userName, session);
        // 广播上线消息
        Message msg = new Message();
        msg.setDate(new Date());
        msg.setTo("0");
        msg.setText(userName);
        broadcast(JSON.toJSONString(msg, true));
    }

    //关闭连接时调用
    @OnClose
    public void onClose(@PathParam(value = "username") String userName) {
        sessionPools.remove(userName);
        // 广播下线消息
        Message msg = new Message();
        msg.setDate(new Date());
        msg.setTo("-2");
        msg.setText(userName);
        broadcast(JSON.toJSONString(msg, true));
    }

    //收到客户端信息后，根据接收人的username把消息推下去或者群发
    // to=-1群发消息
    @OnMessage
    public void onMessage(String message) throws IOException {
        LOGGER.info("server get" + message);
        Message msg = JSON.parseObject(message, Message.class);
        msg.setDate(new Date());
        if (msg.getTo().equals("-1")) {
            broadcast(JSON.toJSONString(msg, true));
        } else {
            sendInfo(msg.getTo(), JSON.toJSONString(msg, true));
        }
    }

    //错误时调用
    @OnError
    public void onError(Session session, Throwable throwable) {
        LOGGER.info("发生错误");
        throwable.printStackTrace();
    }
}
