package org.museframework.bian.tradeclearing.dto;

public class InitiateMarketTradeMatchingWorkstepResponse {
    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeMatchingWorkstep marketTradeMatchingWorkstep;

    public void setMarketTradeMatchingWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeMatchingWorkstep marketTradeMatchingWorkstep) {
        this.marketTradeMatchingWorkstep = marketTradeMatchingWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeMatchingWorkstep getMarketTradeMatchingWorkstep() {
        return marketTradeMatchingWorkstep;
    }
}