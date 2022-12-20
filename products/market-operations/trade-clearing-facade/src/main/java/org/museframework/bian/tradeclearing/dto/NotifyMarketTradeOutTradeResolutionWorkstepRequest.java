package org.museframework.bian.tradeclearing.dto;

public class NotifyMarketTradeOutTradeResolutionWorkstepRequest {
    private String tradeclearingid;

    private String markettradeouttraderesolutionworkstepid;

    public void setTradeclearingid(String tradeclearingid) {
        this.tradeclearingid = tradeclearingid;
    }

    public String getTradeclearingid() {
        return tradeclearingid;
    }

    public void setMarkettradeouttraderesolutionworkstepid(String markettradeouttraderesolutionworkstepid) {
        this.markettradeouttraderesolutionworkstepid = markettradeouttraderesolutionworkstepid;
    }

    public String getMarkettradeouttraderesolutionworkstepid() {
        return markettradeouttraderesolutionworkstepid;
    }
}