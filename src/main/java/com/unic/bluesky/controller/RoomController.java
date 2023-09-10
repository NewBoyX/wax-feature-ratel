/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.unic.bluesky.controller;

import com.unic.bluesky.business.room.vo.RoomVo;
import com.unic.bluesky.business.user.vo.UserVo;
import com.unic.bluesky.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/room")
@Api(tags = "Room API")
public class RoomController {

    private static final Logger logger = LoggerFactory.getLogger(RoomController.class);

    @Autowired
    private RedisService redisService;

    @ApiOperation("创建房间")
    @PostMapping("createRoom")
    public RoomVo createRoom() {
        return null;
    }

    @ApiOperation("房间列表")
    @PostMapping("listRoom")
    public List<RoomVo> listRoom() {
        return null;
    }

    @ApiOperation("房间信息")
    @PostMapping("detail")
    public RoomVo detail(String roomId) {
        return null;
    }

    @ApiOperation("房间成员信息")
    @PostMapping("members")
    public List<UserVo> members(String roomId) {
        return null;
    }


}
