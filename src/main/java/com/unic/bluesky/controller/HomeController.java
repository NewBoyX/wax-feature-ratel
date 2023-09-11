/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.unic.bluesky.controller;

import com.unic.bluesky.business.home.GameVenue;
import com.unic.bluesky.business.home.vo.GameProfileVo;
import com.unic.bluesky.business.home.vo.HomeDataVo;
import com.unic.bluesky.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页接口
 *
 * @author kuloud
 */
@RestController
@RequestMapping(value = "/home")
@Api(tags = "Home API")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private RedisService redisService;

    @ApiOperation("获取首页数据（等级、积分、青果）")
    @PostMapping("getTaskCenterData")
    public HomeDataVo getTaskCenterData() {
        logger.info("getTaskCenterData");
        return null;
    }

    /**
     * 获取游戏配置信息
     * 
     * @return
     */
    @ApiOperation("获取游戏配置信息")
    @PostMapping("getGameProfile")
    public GameProfileVo getGameProfile() {
        logger.info("getGameProfile");

        GameVenue gameVenue1 = new GameVenue();
        gameVenue1.setMinimumScore(10);
        gameVenue1.setTicketPrice(300);
        gameVenue1.setCapLimit(50000);

        GameVenue gameVenue2 = new GameVenue();
        gameVenue2.setMinimumScore(30);
        gameVenue2.setTicketPrice(900);
        gameVenue2.setCapLimit(100000);

        GameVenue gameVenue3 = new GameVenue();
        gameVenue3.setMinimumScore(50);
        gameVenue3.setTicketPrice(3000);
        gameVenue3.setCapLimit(200000);

        GameVenue gameVenue4 = new GameVenue();
        gameVenue4.setMinimumScore(100);
        gameVenue4.setTicketPrice(9000);
        gameVenue4.setCapLimit(1000000);

        // 创建GameProfileVo对象并设置gameVenues属性
        GameProfileVo gameProfileVo = new GameProfileVo();
        gameProfileVo.setGameVenues(Arrays.asList(gameVenue1, gameVenue2, gameVenue3, gameVenue4));

        // 返回GameProfileVo对象
        return gameProfileVo;
    }

}
