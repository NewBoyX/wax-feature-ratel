package com.unic.bluesky.business.room;

import com.unic.bluesky.business.room.vo.RoomVo;
import org.springframework.stereotype.Component;

@Component
public class RoomService {
    /**
     * 创建房间
     *
     * @return
     */
    public RoomVo create() {
        RoomVo room = new RoomVo();
        return room;
    }

    /**
     * 按照房间号，查找房间
     *
     * @param no
     * @return
     */
    public RoomVo findByNo(String no) {
        RoomVo room = new RoomVo();
        return room;
    }

}
