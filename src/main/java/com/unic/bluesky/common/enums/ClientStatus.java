package com.unic.bluesky.common.enums;

/**
 * 客户端状态
 */
public enum ClientStatus {

	TO_CHOOSE,

	NO_READY, // 未准备

	READY, // 已准备

	WAIT, // 等待中

	CALL_LANDLORD, // 叫地主

	PLAYING // 游戏进行中

    

}