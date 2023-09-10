package com.unic.bluesky.common.enums;

/**
 * 时间范围
 */
public enum TimeRegion {
    /**
     * 今日
     */
    TODAY("today"),
    /**
     * 本赛季
     */
    SEASON("season"),
    /**
     * 历史所有
     */
    ALL("all"),
    
    ;

    private String name;

    private TimeRegion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
