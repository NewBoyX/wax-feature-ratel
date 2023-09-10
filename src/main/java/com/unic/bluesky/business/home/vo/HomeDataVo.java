package com.unic.bluesky.business.home.vo;

import java.util.List;

import com.unic.bluesky.business.home.GameVenue;

import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data
@ApiOperation("首页数据信息")
public class HomeDataVo {
    /**
     * 游戏场信息
     */
    private List<GameVenue> gameVenues;
}
