package org.museframework.bian.marketmaking.dto;

public class NotifyMarketMakingBuyandSellOrderFulfillmentRequest {
    private String marketmakingid;

    private String marketmakingbuyandsellorderfulfillmentid;

    public void setMarketmakingid(String marketmakingid) {
        this.marketmakingid = marketmakingid;
    }

    public String getMarketmakingid() {
        return marketmakingid;
    }

    public void setMarketmakingbuyandsellorderfulfillmentid(String marketmakingbuyandsellorderfulfillmentid) {
        this.marketmakingbuyandsellorderfulfillmentid = marketmakingbuyandsellorderfulfillmentid;
    }

    public String getMarketmakingbuyandsellorderfulfillmentid() {
        return marketmakingbuyandsellorderfulfillmentid;
    }
}