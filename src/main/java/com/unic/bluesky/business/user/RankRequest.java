package com.unic.bluesky.business.user;

import io.swagger.annotations.ApiOperation;
import lombok.Data;

/**
 * 排行榜请求
 * 
 * @author kuloud
 */
@Data
@ApiOperation("排行榜请求")
public class RankRequest {
    /**
     * 排行榜范围
     * 个人好友 / 世界
     */
    private String region;
    /**
     * 排行榜类型
     * 富豪榜 / 等级榜
     */
    private String rankType;
    
}
