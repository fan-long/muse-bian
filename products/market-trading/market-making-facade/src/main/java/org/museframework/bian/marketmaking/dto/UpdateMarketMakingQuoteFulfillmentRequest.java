package org.museframework.bian.marketmaking.dto;

public class UpdateMarketMakingQuoteFulfillmentRequest {
    private String marketmakingid;

    private String marketmakingquotefulfillmentid;

    private org.museframework.bian.marketmaking.dto.bq.MarketMakingQuoteFulfillment marketMakingQuoteFulfillment;

    public void setMarketmakingid(String marketmakingid) {
        this.marketmakingid = marketmakingid;
    }

    public String getMarketmakingid() {
        return marketmakingid;
    }

    public void setMarketmakingquotefulfillmentid(String marketmakingquotefulfillmentid) {
        this.marketmakingquotefulfillmentid = marketmakingquotefulfillmentid;
    }

    public String getMarketmakingquotefulfillmentid() {
        return marketmakingquotefulfillmentid;
    }

    public void setMarketMakingQuoteFulfillment(org.museframework.bian.marketmaking.dto.bq.MarketMakingQuoteFulfillment marketMakingQuoteFulfillment) {
        this.marketMakingQuoteFulfillment = marketMakingQuoteFulfillment;
    }

    public org.museframework.bian.marketmaking.dto.bq.MarketMakingQuoteFulfillment getMarketMakingQuoteFulfillment() {
        return marketMakingQuoteFulfillment;
    }
}