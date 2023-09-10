package com.unic.bluesky.business.user;

import com.unic.bluesky.business.user.vo.UserStatVo;
import com.unic.bluesky.business.user.vo.UserVo;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data
@ApiOperation("排行榜元素")
public class RankItem {
    @ApiModelProperty("排行位置")
    private int rankIndex;
    @ApiModelProperty("用户信息")
    private UserVo user;
    @ApiModelProperty("用户统计数据")
    private UserStatVo userStat;

}
