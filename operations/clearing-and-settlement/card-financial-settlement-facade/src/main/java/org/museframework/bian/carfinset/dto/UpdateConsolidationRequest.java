package org.museframework.bian.carfinset.dto;

public class UpdateConsolidationRequest {
    private String cardfinancialsettlementid;

    private String consolidationid;

    private org.museframework.bian.carfinset.dto.bq.Consolidation consolidation;

    public void setCardfinancialsettlementid(String cardfinancialsettlementid) {
        this.cardfinancialsettlementid = cardfinancialsettlementid;
    }

    public String getCardfinancialsettlementid() {
        return cardfinancialsettlementid;
    }

    public void setConsolidationid(String consolidationid) {
        this.consolidationid = consolidationid;
    }

    public String getConsolidationid() {
        return consolidationid;
    }

    public void setConsolidation(org.museframework.bian.carfinset.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.carfinset.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}