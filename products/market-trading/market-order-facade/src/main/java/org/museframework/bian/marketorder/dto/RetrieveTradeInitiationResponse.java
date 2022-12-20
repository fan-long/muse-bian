package org.museframework.bian.marketorder.dto;

public class RetrieveTradeInitiationResponse {
    private org.museframework.bian.marketorder.dto.bq.TradeInitiation tradeInitiation;

    public void setTradeInitiation(org.museframework.bian.marketorder.dto.bq.TradeInitiation tradeInitiation) {
        this.tradeInitiation = tradeInitiation;
    }

    public org.museframework.bian.marketorder.dto.bq.TradeInitiation getTradeInitiation() {
        return tradeInitiation;
    }
}