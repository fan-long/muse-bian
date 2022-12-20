package org.museframework.bian.tradeclearing.dto;

public class NotifyMarketTradeSettlementInitiationWorkstepResponse {
    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeSettlementInitiationWorkstep marketTradeSettlementInitiationWorkstep;

    public void setMarketTradeSettlementInitiationWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeSettlementInitiationWorkstep marketTradeSettlementInitiationWorkstep) {
        this.marketTradeSettlementInitiationWorkstep = marketTradeSettlementInitiationWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeSettlementInitiationWorkstep getMarketTradeSettlementInitiationWorkstep() {
        return marketTradeSettlementInitiationWorkstep;
    }
}