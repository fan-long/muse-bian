package org.museframework.bian.invporman.dto;

public class ExchangeTradeInitiationResponse {
    private org.museframework.bian.invporman.dto.bq.TradeInitiation tradeInitiation;

    public void setTradeInitiation(org.museframework.bian.invporman.dto.bq.TradeInitiation tradeInitiation) {
        this.tradeInitiation = tradeInitiation;
    }

    public org.museframework.bian.invporman.dto.bq.TradeInitiation getTradeInitiation() {
        return tradeInitiation;
    }
}