/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.unic.bluesky.controller;

import com.unic.bluesky.business.home.vo.HomeDataVo;
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
    @PostMapping
    public HomeDataVo getTaskCenterData() {
        logger.info("getTaskCenterData");
        return null;
    }

    /**
     * 获取游戏配置信息
     * @return
     */
    @ApiOperation("获取游戏配置信息")
    @PostMapping
    public HomeDataVo getGameProfile() {
        logger.info("getGameProfile");
        return null;
    }

}
