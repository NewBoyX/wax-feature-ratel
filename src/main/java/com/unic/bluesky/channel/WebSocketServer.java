package com.unic.bluesky.channel;

import com.alibaba.fastjson.JSON;
import com.unic.bluesky.channel.vo.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;


@ServerEndpoint("/webSocket/{userId}")
@Component
public class WebSocketServer implements MessageChannel {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketServer.class);


    private static ConcurrentHashMap<String, Session> sessionPools = new ConcurrentHashMap<>();


    public static ConcurrentHashMap<String, Session> getSessionPools() {
        return sessionPools;
    }


    @Override
    public void send(String userId, Message message) {
        sendInfo(userId, JSON.toJSONString(message));
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
    public void sendInfo(String userId, String message) {
        Session session = sessionPools.get(userId);
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
    public void onOpen(Session session, @PathParam(value = "userId") String userId) {
        sessionPools.put(userId, session);
    }

    //关闭连接时调用
    @OnClose
    public void onClose(@PathParam(value = "userId") String userId) {
        sessionPools.remove(userId);

    }

    //收到客户端信息后，根据接收人的userId把消息推下去或者群发
    // to=-1群发消息
    @OnMessage
    public void onMessage(String message) throws IOException {
        LOGGER.info("server get" + message);

    }

    //错误时调用
    @OnError
    public void onError(Session session, Throwable throwable) {
        LOGGER.info("发生错误");
        throwable.printStackTrace();
    }
}
