package org.museframework.bian.marketmaking.dto;

public class RequestMarketMakingSecurityTradedPositionFulfillmentRequest {
    private String marketmakingid;

    private String marketmakingsecuritytradedpositionfulfillmentid;

    private org.museframework.bian.marketmaking.dto.bq.MarketMakingSecurityTradedPositionFulfillment marketMakingSecurityTradedPositionFulfillment;

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

    public void setMarketMakingSecurityTradedPositionFulfillment(org.museframework.bian.marketmaking.dto.bq.MarketMakingSecurityTradedPositionFulfillment marketMakingSecurityTradedPositionFulfillment) {
        this.marketMakingSecurityTradedPositionFulfillment = marketMakingSecurityTradedPositionFulfillment;
    }

    public org.museframework.bian.marketmaking.dto.bq.MarketMakingSecurityTradedPositionFulfillment getMarketMakingSecurityTradedPositionFulfillment() {
        return marketMakingSecurityTradedPositionFulfillment;
    }
}