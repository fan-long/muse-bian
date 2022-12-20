package org.museframework.bian.compliancereporting.dto;

public class UpdateConsolidationRequest {
    private String compliancereportingid;

    private String consolidationid;

    private org.museframework.bian.compliancereporting.dto.bq.Consolidation consolidation;

    public void setCompliancereportingid(String compliancereportingid) {
        this.compliancereportingid = compliancereportingid;
    }

    public String getCompliancereportingid() {
        return compliancereportingid;
    }

    public void setConsolidationid(String consolidationid) {
        this.consolidationid = consolidationid;
    }

    public String getConsolidationid() {
        return consolidationid;
    }

    public void setConsolidation(org.museframework.bian.compliancereporting.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.compliancereporting.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}