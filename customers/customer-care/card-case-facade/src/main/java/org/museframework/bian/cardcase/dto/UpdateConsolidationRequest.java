package org.museframework.bian.cardcase.dto;

public class UpdateConsolidationRequest {
    private String cardcaseid;

    private String consolidationid;

    private org.museframework.bian.cardcase.dto.bq.Consolidation consolidation;

    public void setCardcaseid(String cardcaseid) {
        this.cardcaseid = cardcaseid;
    }

    public String getCardcaseid() {
        return cardcaseid;
    }

    public void setConsolidationid(String consolidationid) {
        this.consolidationid = consolidationid;
    }

    public String getConsolidationid() {
        return consolidationid;
    }

    public void setConsolidation(org.museframework.bian.cardcase.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.cardcase.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}