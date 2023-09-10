package com.unic.bluesky.business.card.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.util.List;

@Data
@ApiOperation("牌桌信息")
public class TableVo {
    @ApiModelProperty("坐席信息")
    private List<Representative> representatives;

}
