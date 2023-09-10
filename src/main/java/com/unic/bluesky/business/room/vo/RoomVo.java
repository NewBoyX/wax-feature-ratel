package com.unic.bluesky.business.room.vo;

import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data
@ApiOperation("房间信息")
public class RoomVo {
    /**
     * 房间id
     */
    private String id;
    /**
     * 房间号
     */
    private String no;
    /**
     * 房间名称
     */
    private String label;
}
