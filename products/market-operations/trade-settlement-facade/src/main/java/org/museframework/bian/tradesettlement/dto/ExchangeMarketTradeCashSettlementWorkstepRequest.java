package org.museframework.bian.tradesettlement.dto;

public class ExchangeMarketTradeCashSettlementWorkstepRequest {
    private String tradesettlementid;

    private String markettradecashsettlementworkstepid;

    private org.museframework.bian.tradesettlement.dto.bq.MarketTradeCashSettlementWorkstep marketTradeCashSettlementWorkstep;

    public void setTradesettlementid(String tradesettlementid) {
        this.tradesettlementid = tradesettlementid;
    }

    public String getTradesettlementid() {
        return tradesettlementid;
    }

    public void setMarkettradecashsettlementworkstepid(String markettradecashsettlementworkstepid) {
        this.markettradecashsettlementworkstepid = markettradecashsettlementworkstepid;
    }

    public String getMarkettradecashsettlementworkstepid() {
        return markettradecashsettlementworkstepid;
    }

    public void setMarketTradeCashSettlementWorkstep(org.museframework.bian.tradesettlement.dto.bq.MarketTradeCashSettlementWorkstep marketTradeCashSettlementWorkstep) {
        this.marketTradeCashSettlementWorkstep = marketTradeCashSettlementWorkstep;
    }

    public org.museframework.bian.tradesettlement.dto.bq.MarketTradeCashSettlementWorkstep getMarketTradeCashSettlementWorkstep() {
        return marketTradeCashSettlementWorkstep;
    }
}