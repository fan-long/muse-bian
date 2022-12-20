package org.museframework.bian.tradeclearing.dto;

public class InitiateMarketTradeConfirmationWorkstepResponse {
    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeConfirmationWorkstep marketTradeConfirmationWorkstep;

    public void setMarketTradeConfirmationWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeConfirmationWorkstep marketTradeConfirmationWorkstep) {
        this.marketTradeConfirmationWorkstep = marketTradeConfirmationWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeConfirmationWorkstep getMarketTradeConfirmationWorkstep() {
        return marketTradeConfirmationWorkstep;
    }
}