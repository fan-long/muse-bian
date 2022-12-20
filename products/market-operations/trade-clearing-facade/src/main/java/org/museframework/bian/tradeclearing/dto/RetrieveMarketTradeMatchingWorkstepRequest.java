package org.museframework.bian.tradeclearing.dto;

public class RetrieveMarketTradeMatchingWorkstepRequest {
    private String tradeclearingid;

    private String markettradematchingworkstepid;

    public void setTradeclearingid(String tradeclearingid) {
        this.tradeclearingid = tradeclearingid;
    }

    public String getTradeclearingid() {
        return tradeclearingid;
    }

    public void setMarkettradematchingworkstepid(String markettradematchingworkstepid) {
        this.markettradematchingworkstepid = markettradematchingworkstepid;
    }

    public String getMarkettradematchingworkstepid() {
        return markettradematchingworkstepid;
    }
}