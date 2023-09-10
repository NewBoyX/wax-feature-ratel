package com.unic.bluesky.common.enums;

/**
 * 排行类型
 */
public enum RankType {
    /**
     * 富豪榜
     */
    MONEY("money"),
    /**
     * 等级榜
     */
    LEVEL("level");

    private String name;

    private RankType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
