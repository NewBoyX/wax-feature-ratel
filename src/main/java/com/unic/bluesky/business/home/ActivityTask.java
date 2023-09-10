package com.unic.bluesky.business.home;

import java.util.Map;

/**
 * 活动任务
 */
public class ActivityTask {
    /**
     * 任务ID
     */
    private int id;
    /**
     * 任务Icon链接
     */
    private String iconUrl;
    /**
     * 任务标题
     */
    private String title;
    /**
     * 任务描述
     */
    private String description;
    /**
     * 任务状态
     */
    private int status;
    /**
     * 任务状态名
     */
    private String statusName;
    /**
     * 按钮点击跳转链接
     */
    private String actionUrl;
    /**
     * 拓展信息
     */
    private Map<String, Object> extras;
}
