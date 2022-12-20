package org.museframework.bian.tradeclearing.dto;

public class UpdateMarketTradeOutTradeResolutionWorkstepRequest {
    private String tradeclearingid;

    private String markettradeouttraderesolutionworkstepid;

    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeOutTradeResolutionWorkstep marketTradeOutTradeResolutionWorkstep;

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

    public void setMarketTradeOutTradeResolutionWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeOutTradeResolutionWorkstep marketTradeOutTradeResolutionWorkstep) {
        this.marketTradeOutTradeResolutionWorkstep = marketTradeOutTradeResolutionWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeOutTradeResolutionWorkstep getMarketTradeOutTradeResolutionWorkstep() {
        return marketTradeOutTradeResolutionWorkstep;
    }
}