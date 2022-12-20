package org.museframework.bian.carfinset.dto;

public class UpdateConsolidationResponse {
    private org.museframework.bian.carfinset.dto.bq.Consolidation consolidation;

    public void setConsolidation(org.museframework.bian.carfinset.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.carfinset.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}