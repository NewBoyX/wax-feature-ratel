package com.unic.bluesky.service;

import com.unic.bluesky.vo.Message;

public interface MessageChannel {

    void send(String id, Message message);

}
