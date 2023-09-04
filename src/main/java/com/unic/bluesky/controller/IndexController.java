/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.unic.bluesky.controller;

import com.unic.bluesky.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring-boot-demo-5-1
 *
 * @author wujing
 */
@RestController
@RequestMapping(value = "/index")
@Api(tags = "User API")
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private RedisService redisService;

    @ApiOperation("Get user by ID")
    @GetMapping
    public String index() {
        logger.info("hello");
        return "hello";
    }


}
