package org.museframework.bian.tradesettlement.dto;

public class RetrieveMarketTradeSettlementConfirmationWorkstepRequest {
    private String tradesettlementid;

    private String markettradesettlementconfirmationworkstepid;

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
}