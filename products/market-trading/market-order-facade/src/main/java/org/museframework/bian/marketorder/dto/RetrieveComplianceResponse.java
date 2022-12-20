package org.museframework.bian.marketorder.dto;

public class RetrieveComplianceResponse {
    private org.museframework.bian.marketorder.dto.bq.Compliance compliance;

    public void setCompliance(org.museframework.bian.marketorder.dto.bq.Compliance compliance) {
        this.compliance = compliance;
    }

    public org.museframework.bian.marketorder.dto.bq.Compliance getCompliance() {
        return compliance;
    }
}