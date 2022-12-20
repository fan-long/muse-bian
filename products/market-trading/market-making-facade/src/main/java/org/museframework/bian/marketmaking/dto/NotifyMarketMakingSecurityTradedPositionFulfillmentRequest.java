package org.museframework.bian.marketmaking.dto;

public class NotifyMarketMakingSecurityTradedPositionFulfillmentRequest {
    private String marketmakingid;

    private String marketmakingsecuritytradedpositionfulfillmentid;

    public void setMarketmakingid(String marketmakingid) {
        this.marketmakingid = marketmakingid;
    }

    public String getMarketmakingid() {
        return marketmakingid;
    }

    public void setMarketmakingsecuritytradedpositionfulfillmentid(String marketmakingsecuritytradedpositionfulfillmentid) {
        this.marketmakingsecuritytradedpositionfulfillmentid = marketmakingsecuritytradedpositionfulfillmentid;
    }

    public String getMarketmakingsecuritytradedpositionfulfillmentid() {
        return marketmakingsecuritytradedpositionfulfillmentid;
    }
}