package org.museframework.bian.cardcase.dto;

public class UpdateConsolidationResponse {
    private org.museframework.bian.cardcase.dto.bq.Consolidation consolidation;

    public void setConsolidation(org.museframework.bian.cardcase.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.cardcase.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}