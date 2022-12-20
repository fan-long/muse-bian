package org.museframework.bian.tradesettlement.dto;

public class UpdateMarketTradeSecuritiesSettlementWorkstepRequest {
    private String tradesettlementid;

    private String markettradesecuritiessettlementworkstepid;

    private org.museframework.bian.tradesettlement.dto.bq.MarketTradeSecuritiesSettlementWorkstep marketTradeSecuritiesSettlementWorkstep;

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

    public void setMarketTradeSecuritiesSettlementWorkstep(org.museframework.bian.tradesettlement.dto.bq.MarketTradeSecuritiesSettlementWorkstep marketTradeSecuritiesSettlementWorkstep) {
        this.marketTradeSecuritiesSettlementWorkstep = marketTradeSecuritiesSettlementWorkstep;
    }

    public org.museframework.bian.tradesettlement.dto.bq.MarketTradeSecuritiesSettlementWorkstep getMarketTradeSecuritiesSettlementWorkstep() {
        return marketTradeSecuritiesSettlementWorkstep;
    }
}