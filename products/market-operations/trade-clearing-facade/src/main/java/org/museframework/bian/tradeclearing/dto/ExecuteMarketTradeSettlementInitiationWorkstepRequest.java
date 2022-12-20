package org.museframework.bian.tradeclearing.dto;

public class ExecuteMarketTradeSettlementInitiationWorkstepRequest {
    private String tradeclearingid;

    private String markettradesettlementinitiationworkstepid;

    private org.museframework.bian.tradeclearing.dto.bq.MarketTradeSettlementInitiationWorkstep marketTradeSettlementInitiationWorkstep;

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

    public void setMarketTradeSettlementInitiationWorkstep(org.museframework.bian.tradeclearing.dto.bq.MarketTradeSettlementInitiationWorkstep marketTradeSettlementInitiationWorkstep) {
        this.marketTradeSettlementInitiationWorkstep = marketTradeSettlementInitiationWorkstep;
    }

    public org.museframework.bian.tradeclearing.dto.bq.MarketTradeSettlementInitiationWorkstep getMarketTradeSettlementInitiationWorkstep() {
        return marketTradeSettlementInitiationWorkstep;
    }
}