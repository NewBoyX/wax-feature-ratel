package com.unic.bluesky.business.home.vo;

import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data
@ApiOperation("首页数据信息")
public class HomeDataVo {
    /**
     * 房间id
     */
    private String id;
    /**
     * 房间号
     */
    private String no;
    /**
     * 房间名称
     */
    private String label;
}
