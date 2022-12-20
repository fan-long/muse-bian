package org.museframework.bian.marinfman.dto;

public class RetrieveConsolidationResponse {
    private org.museframework.bian.marinfman.dto.bq.Consolidation consolidation;

    public void setConsolidation(org.museframework.bian.marinfman.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.marinfman.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}