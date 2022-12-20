package org.museframework.bian.tradesettlement.dto;

public class ExchangeMarketTradeSettlementConfirmationWorkstepRequest {
    private String tradesettlementid;

    private String markettradesettlementconfirmationworkstepid;

    private org.museframework.bian.tradesettlement.dto.bq.MarketTradeSettlementConfirmationWorkstep marketTradeSettlementConfirmationWorkstep;

    public void setTradesettlementid(String tradesettlementid) {
        this.tradesettlementid = tradesettlementid;
    }

    public String getTradesettlementid() {
        return tradesettlementid;
    }

    public void setMarkettradesettlementconfirmationworkstepid(String markettradesettlementconfirmationworkstepid) {
        this.markettradesettlementconfirmationworkstepid = markettradesettlementconfirmationworkstepid;
    }

    public String getMarkettradesettlementconfirmationworkstepid() {
        return markettradesettlementconfirmationworkstepid;
    }

    public void setMarketTradeSettlementConfirmationWorkstep(org.museframework.bian.tradesettlement.dto.bq.MarketTradeSettlementConfirmationWorkstep marketTradeSettlementConfirmationWorkstep) {
        this.marketTradeSettlementConfirmationWorkstep = marketTradeSettlementConfirmationWorkstep;
    }

    public org.museframework.bian.tradesettlement.dto.bq.MarketTradeSettlementConfirmationWorkstep getMarketTradeSettlementConfirmationWorkstep() {
        return marketTradeSettlementConfirmationWorkstep;
    }
}