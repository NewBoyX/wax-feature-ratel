package com.unic.bluesky.channel;

import com.unic.bluesky.channel.vo.Message;

public interface MessageChannel {

    void send(String id, Message message);

}
