package com.unic.bluesky.business.home;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

/**
 * 游戏场
 */
@Data
@ApiOperation("GameVenue")
public class GameVenue {
    /**
     * 游戏等级
     */
    @ApiModelProperty("level")
    private int level;
    /**
     * 游戏场名字
     */
    @ApiModelProperty("levelName")
    private String levelName;
    /**
     * 底分
     */
    @ApiModelProperty("minimumScore")
    private int minimumScore;
    /**
     * 门票
     */
    @ApiModelProperty("ticketPrice")
    private int ticketPrice;
    /**
     * 封顶
     */
    @ApiModelProperty("capLimit")
    private int capLimit;
    /**
     * 当前场内人数
     */
    @ApiModelProperty("onlinePlayers")
    private int onlinePlayers;
}
