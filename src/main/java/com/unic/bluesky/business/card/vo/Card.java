package com.unic.bluesky.business.card.vo;

import lombok.Data;

import java.util.List;

@Data
public class Card {

    private String userId;
    /**
     * 出牌时间
     */
    private Long pubTime;
    /**
     * 最后一次出牌
     */
    private List<String> latest;
    /**
     * 手上剩余的牌
     */
    private List<String> remains;

}
