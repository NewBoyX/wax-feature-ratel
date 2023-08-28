package com.unic.bluesky.business.room;

import com.unic.bluesky.business.room.vo.RoomVo;
import org.springframework.stereotype.Component;

@Component
public class RoomService {

    public RoomVo create() {
        RoomVo room = new RoomVo();
        return room;
    }

}
