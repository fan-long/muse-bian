package org.museframework.bian.compliancereporting.dto;

public class RequestRemediationResponse {
    private org.museframework.bian.compliancereporting.dto.bq.Remediation remediation;

    public void setRemediation(org.museframework.bian.compliancereporting.dto.bq.Remediation remediation) {
        this.remediation = remediation;
    }

    public org.museframework.bian.compliancereporting.dto.bq.Remediation getRemediation() {
        return remediation;
    }
}