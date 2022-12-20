package org.museframework.bian.marordexe.dto;

public class InitiateTradeInitiationRequest {
    private String marketorderexecutionid;

    private String tradeinitiationid;

    private org.museframework.bian.marordexe.dto.bq.TradeInitiation tradeInitiation;

    public void setMarketorderexecutionid(String marketorderexecutionid) {
        this.marketorderexecutionid = marketorderexecutionid;
    }

    public String getMarketorderexecutionid() {
        return marketorderexecutionid;
    }

    public void setTradeinitiationid(String tradeinitiationid) {
        this.tradeinitiationid = tradeinitiationid;
    }

    public String getTradeinitiationid() {
        return tradeinitiationid;
    }

    public void setTradeInitiation(org.museframework.bian.marordexe.dto.bq.TradeInitiation tradeInitiation) {
        this.tradeInitiation = tradeInitiation;
    }

    public org.museframework.bian.marordexe.dto.bq.TradeInitiation getTradeInitiation() {
        return tradeInitiation;
    }
}