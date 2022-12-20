package org.museframework.bian.marordexe.dto;

public class RetrieveTradeInitiationResponse {
    private org.museframework.bian.marordexe.dto.bq.TradeInitiation tradeInitiation;

    public void setTradeInitiation(org.museframework.bian.marordexe.dto.bq.TradeInitiation tradeInitiation) {
        this.tradeInitiation = tradeInitiation;
    }

    public org.museframework.bian.marordexe.dto.bq.TradeInitiation getTradeInitiation() {
        return tradeInitiation;
    }
}