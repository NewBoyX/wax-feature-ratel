package com.unic.bluesky.business.card.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.util.List;

@Data
@ApiOperation("牌桌信息")
public class TableVo {

    /**
     * 等待所有人员上桌
     */
    public static final int STATUS_WAIT = 1;
    /**
     * 所有人员已经上桌
     */
    public static final int STATUS_READY = 2;
    /**
     * 抢地主
     */
    public static final int STATUS_RAB = 3;
    /**
     * 游戏中
     */
    public static final int STATUS_GAMING = 4;
    /**
     * 游戏结束
     */
    public static final int STATUS_END = 5;


    @ApiModelProperty("坐席信息")
    private List<Representative> representatives;
    @ApiModelProperty("牌桌版本")
    private long version;
    @ApiModelProperty("牌桌状态")
    private int status;


}
