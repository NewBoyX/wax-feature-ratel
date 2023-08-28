package com.unic.bluesky.business.room.vo;

import lombok.Data;

@Data
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
