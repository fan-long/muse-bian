package org.museframework.bian.compliancereporting.dto;

public class RequestConsolidationResponse {
    private org.museframework.bian.compliancereporting.dto.bq.Consolidation consolidation;

    public void setConsolidation(org.museframework.bian.compliancereporting.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.compliancereporting.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}