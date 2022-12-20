package org.museframework.bian.marketmaking.dto;

public class RetrieveMarketMakingQuoteFulfillmentResponse {
    private org.museframework.bian.marketmaking.dto.bq.MarketMakingQuoteFulfillment marketMakingQuoteFulfillment;

    public void setMarketMakingQuoteFulfillment(org.museframework.bian.marketmaking.dto.bq.MarketMakingQuoteFulfillment marketMakingQuoteFulfillment) {
        this.marketMakingQuoteFulfillment = marketMakingQuoteFulfillment;
    }

    public org.museframework.bian.marketmaking.dto.bq.MarketMakingQuoteFulfillment getMarketMakingQuoteFulfillment() {
        return marketMakingQuoteFulfillment;
    }
}