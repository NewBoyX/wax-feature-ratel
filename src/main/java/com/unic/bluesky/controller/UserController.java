/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.unic.bluesky.controller;

import com.unic.bluesky.business.home.vo.HomeDataVo;
import com.unic.bluesky.business.user.RankRequest;
import com.unic.bluesky.business.user.vo.UserVo;
import com.unic.bluesky.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring-boot-demo-5-1
 *
 * @author wujing
 */
@RestController
@RequestMapping(value = "/user")
@Api(tags = "User API")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private RedisService redisService;

    @ApiOperation("获取用户数据")
    @PostMapping("getUserProfile")
    public UserVo getUserProfile() {
        logger.info("getUserProfile");
        return null;
    }

    @ApiOperation("获取用户排行数据")
    @PostMapping("getRankData")
    public UserVo getRankData(@RequestBody RankRequest request) {
        logger.info("getRankData");
        return null;
    }
}
