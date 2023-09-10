package com.unic.bluesky.business.user.vo;

import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data
@ApiOperation("用户信息")
public class UserVo {
    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户头像
     */
    private String avatorUrl;

    /**
     * 积分
     */
    private int points;

    /**
     * 青果
     */
    private int beans;

    /**
     * 用户等级
     */
    private int level;
}
