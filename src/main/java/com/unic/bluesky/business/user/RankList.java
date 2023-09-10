package com.unic.bluesky.business.user;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data
@ApiOperation("排行榜")
public class RankList {
    @ApiModelProperty("排行榜列表")
    private List<RankItem> rankItems;
}
