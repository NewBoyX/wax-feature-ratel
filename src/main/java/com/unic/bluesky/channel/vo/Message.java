package com.unic.bluesky.channel.vo;

import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data
@ApiOperation("推送信息")
public class Message {

    private String topic;

    private Integer what;

    private String arg;

}
