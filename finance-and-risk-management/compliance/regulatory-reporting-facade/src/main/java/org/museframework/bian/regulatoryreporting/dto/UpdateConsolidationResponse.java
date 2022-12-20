package org.museframework.bian.regulatoryreporting.dto;

public class UpdateConsolidationResponse {
    private org.museframework.bian.regulatoryreporting.dto.bq.Consolidation consolidation;

    public void setConsolidation(org.museframework.bian.regulatoryreporting.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.regulatoryreporting.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}