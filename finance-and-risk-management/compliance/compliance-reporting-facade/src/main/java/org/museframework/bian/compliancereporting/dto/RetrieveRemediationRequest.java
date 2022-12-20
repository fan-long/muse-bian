package org.museframework.bian.compliancereporting.dto;

public class RetrieveRemediationRequest {
    private String compliancereportingid;

    private String remediationid;

    public void setCompliancereportingid(String compliancereportingid) {
        this.compliancereportingid = compliancereportingid;
    }

    public String getCompliancereportingid() {
        return compliancereportingid;
    }

    public void setRemediationid(String remediationid) {
        this.remediationid = remediationid;
    }

    public String getRemediationid() {
        return remediationid;
    }
}