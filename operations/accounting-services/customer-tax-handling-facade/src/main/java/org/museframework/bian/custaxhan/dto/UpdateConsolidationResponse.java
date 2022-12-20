package org.museframework.bian.custaxhan.dto;

public class UpdateConsolidationResponse {
    private org.museframework.bian.custaxhan.dto.bq.Consolidation consolidation;

    public void setConsolidation(org.museframework.bian.custaxhan.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.custaxhan.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}