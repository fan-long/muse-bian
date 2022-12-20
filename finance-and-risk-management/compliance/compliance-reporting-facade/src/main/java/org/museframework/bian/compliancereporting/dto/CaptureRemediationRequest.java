package org.museframework.bian.compliancereporting.dto;

public class CaptureRemediationRequest {
    private String compliancereportingid;

    private String remediationid;

    private org.museframework.bian.compliancereporting.dto.bq.Remediation remediation;

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

    public void setRemediation(org.museframework.bian.compliancereporting.dto.bq.Remediation remediation) {
        this.remediation = remediation;
    }

    public org.museframework.bian.compliancereporting.dto.bq.Remediation getRemediation() {
        return remediation;
    }
}