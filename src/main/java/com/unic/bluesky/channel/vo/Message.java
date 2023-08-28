package com.unic.bluesky.channel.vo;

import lombok.Data;

@Data
public class Message {

    private String topic;

    private Integer what;

    private String arg;

}
