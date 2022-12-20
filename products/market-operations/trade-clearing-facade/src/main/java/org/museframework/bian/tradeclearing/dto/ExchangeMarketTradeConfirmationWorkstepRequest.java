package org.museframework.bian.tradeclearing.dto;

public class ExchangeMarketTradeConfirmationWorkstepRequest {
    private String tradeclearingid;

    private String markettradeconfirmationworkstepid;

    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeConfirmationWorkstep marketTradeConfirmationWorkstep;

    public void setTradeclearingid(String tradeclearingid) {
        this.tradeclearingid = tradeclearingid;
    }

    public String getTradeclearingid() {
        return tradeclearingid;
    }

    public void setMarkettradeconfirmationworkstepid(String markettradeconfirmationworkstepid) {
        this.markettradeconfirmationworkstepid = markettradeconfirmationworkstepid;
    }

    public String getMarkettradeconfirmationworkstepid() {
        return markettradeconfirmationworkstepid;
    }

    public void setMarketTradeConfirmationWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeConfirmationWorkstep marketTradeConfirmationWorkstep) {
        this.marketTradeConfirmationWorkstep = marketTradeConfirmationWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeConfirmationWorkstep getMarketTradeConfirmationWorkstep() {
        return marketTradeConfirmationWorkstep;
    }
}