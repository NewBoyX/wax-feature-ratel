package com.unic.bluesky.business.card.vo;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.util.List;

@Data
@ApiOperation("坐席信息")
public class Representative {

    /**
     * 地主手上的牌
     */
    public static final int TYPE_MASTER = 1;
    /**
     * 农名手上的牌
     */
    public static final int TYPE_NORMAL = 2;
    /**
     * 地主牌
     */
    public static final int TYPE_LEFTOVER = 3;
    /**
     * 最近出牌
     */
    public static final int TYPE_RECENTLY = 4;
    @ApiModelProperty("牌")
    private List<CardVo> cards;
    @ApiModelProperty("牌面类型")
    private int type;
    @ApiModelProperty("打牌的用户")
    private String userId;
    @ApiModelProperty("出牌时间")
    private Long pubTime;
}
