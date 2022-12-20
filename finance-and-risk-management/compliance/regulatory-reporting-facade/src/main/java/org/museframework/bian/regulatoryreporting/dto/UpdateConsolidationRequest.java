package org.museframework.bian.regulatoryreporting.dto;

public class UpdateConsolidationRequest {
    private String regulatoryreportingid;

    private String consolidationid;

    private org.museframework.bian.regulatoryreporting.dto.bq.Consolidation consolidation;

    public void setRegulatoryreportingid(String regulatoryreportingid) {
        this.regulatoryreportingid = regulatoryreportingid;
    }

    public String getRegulatoryreportingid() {
        return regulatoryreportingid;
    }

    public void setConsolidationid(String consolidationid) {
        this.consolidationid = consolidationid;
    }

    public String getConsolidationid() {
        return consolidationid;
    }

    public void setConsolidation(org.museframework.bian.regulatoryreporting.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.regulatoryreporting.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}