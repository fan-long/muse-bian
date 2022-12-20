package org.museframework.bian.marordexe.dto;

public class RetrieveTradeInitiationRequest {
    private String marketorderexecutionid;

    private String tradeinitiationid;

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
}