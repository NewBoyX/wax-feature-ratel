package com.unic.bluesky.business.home.vo;

import java.util.List;

import com.unic.bluesky.business.home.GameVenue;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data
@ApiOperation("游戏配置信息")
public class GameProfileVo {
    /**
     * 游戏场信息
     */
    @ApiModelProperty("gameVenues")
    private List<GameVenue> gameVenues;
}
