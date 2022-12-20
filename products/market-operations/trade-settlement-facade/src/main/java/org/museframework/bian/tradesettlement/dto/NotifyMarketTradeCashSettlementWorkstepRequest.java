package org.museframework.bian.tradesettlement.dto;

public class NotifyMarketTradeCashSettlementWorkstepRequest {
    private String tradesettlementid;

    private String markettradecashsettlementworkstepid;

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
}