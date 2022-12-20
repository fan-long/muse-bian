package org.museframework.bian.tradeclearing.dto;

public class RetrieveMarketTradeConfirmationWorkstepRequest {
    private String tradeclearingid;

    private String markettradeconfirmationworkstepid;

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
}