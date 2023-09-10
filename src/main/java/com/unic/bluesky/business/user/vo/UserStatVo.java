package com.unic.bluesky.business.user.vo;

import com.unic.bluesky.common.enums.TimeRegion;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

/**
 * 用户统计数据，当日/当赛季/历史 维度数据
 */
@Data
@ApiOperation("用户统计数据")
public class UserStatVo {
    /**
     * 用户ID
     */
    @ApiModelProperty("用户ID")
    private String userId;

    /**
     * 时间区间
     */
    private TimeRegion timeRegion;

    /**
     * 游戏总次数
     */
    @ApiModelProperty("游戏总次数")
    private int total;


    /**
     * 游戏胜利次数
     */
    @ApiModelProperty("游戏胜利次数")
    private int win;

    /**
     * 游戏最大连胜数
     */
    @ApiModelProperty("游戏最大连胜数")
    private int stillWin;


    /**
     * 游戏获得青果数
     */
    @ApiModelProperty("游戏获得青果数")
    private int gainBeans;


    /**
     * 春天数
     */
    @ApiModelProperty("春天数")
    private int springTimes;

    /**
     * 最高倍数
     */
    @ApiModelProperty("最高倍数")
    private int maxTimes;

    /**
     * 炸弹次数
     */
    @ApiModelProperty("炸弹次数")
    private int boomTimes;
    
}
