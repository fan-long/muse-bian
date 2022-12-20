package org.museframework.bian.tradeclearing.dto;

public class NotifyMarketTradeSettlementInitiationWorkstepRequest {
    private String tradeclearingid;

    private String markettradesettlementinitiationworkstepid;

    public void setTradeclearingid(String tradeclearingid) {
        this.tradeclearingid = tradeclearingid;
    }

    public String getTradeclearingid() {
        return tradeclearingid;
    }

    public void setMarkettradesettlementinitiationworkstepid(String markettradesettlementinitiationworkstepid) {
        this.markettradesettlementinitiationworkstepid = markettradesettlementinitiationworkstepid;
    }

    public String getMarkettradesettlementinitiationworkstepid() {
        return markettradesettlementinitiationworkstepid;
    }
}