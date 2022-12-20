package org.museframework.bian.tradesettlement.dto;

public class NotifyMarketTradeSecuritiesSettlementWorkstepRequest {
    private String tradesettlementid;

    private String markettradesecuritiessettlementworkstepid;

    public void setTradesettlementid(String tradesettlementid) {
        this.tradesettlementid = tradesettlementid;
    }

    public String getTradesettlementid() {
        return tradesettlementid;
    }

    public void setMarkettradesecuritiessettlementworkstepid(String markettradesecuritiessettlementworkstepid) {
        this.markettradesecuritiessettlementworkstepid = markettradesecuritiessettlementworkstepid;
    }

    public String getMarkettradesecuritiessettlementworkstepid() {
        return markettradesecuritiessettlementworkstepid;
    }
}