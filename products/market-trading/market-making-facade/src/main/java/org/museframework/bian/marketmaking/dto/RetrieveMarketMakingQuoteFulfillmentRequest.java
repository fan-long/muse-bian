package org.museframework.bian.marketmaking.dto;

public class RetrieveMarketMakingQuoteFulfillmentRequest {
    private String marketmakingid;

    private String marketmakingquotefulfillmentid;

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
}