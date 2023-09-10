/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.unic.bluesky.controller;

import com.unic.bluesky.business.card.vo.CardVo;
import com.unic.bluesky.business.card.vo.TableVo;
import com.unic.bluesky.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/card")
@Api(tags = "Card API")
public class CardController {

    private static final Logger logger = LoggerFactory.getLogger(CardController.class);

    @Autowired
    private RedisService redisService;

    @ApiOperation("牌桌信息")
    @PostMapping("cards")
    public TableVo cards(@RequestBody String roomId) {
        return null;
    }

    @ApiOperation("抢地主")
    @PostMapping("landlord")
    public void landlord(@RequestBody String roomId) {

    }

    @ApiOperation("开局")
    @PostMapping("start")
    public void start(@RequestBody String roomId) {

    }

    @ApiOperation("挂机")
    @PostMapping("idle")
    public void idle(@RequestBody String roomId) {

    }


}
