package com.unic.bluesky.common.enums;

/**
 * 范围
 */
public enum Region {
    /**
     * 好友
     */
    FRIEND("friend"),
    /**
     * 世界
     */
    WORLD("world");

    private String name;

    private Region(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
