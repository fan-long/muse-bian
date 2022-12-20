package org.museframework.bian.tradeclearing.dto;

public class ExecuteMarketTradeMatchingWorkstepRequest {
    private String tradeclearingid;

    private String markettradematchingworkstepid;

    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeMatchingWorkstep marketTradeMatchingWorkstep;

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

    public void setMarketTradeMatchingWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeMatchingWorkstep marketTradeMatchingWorkstep) {
        this.marketTradeMatchingWorkstep = marketTradeMatchingWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeMatchingWorkstep getMarketTradeMatchingWorkstep() {
        return marketTradeMatchingWorkstep;
    }
}