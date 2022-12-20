package org.museframework.bian.paymentinitiation.dto;

public class RetrieveComplianceResponse {
    private org.museframework.bian.paymentinitiation.dto.bq.Compliance compliance;

    public void setCompliance(org.museframework.bian.paymentinitiation.dto.bq.Compliance compliance) {
        this.compliance = compliance;
    }

    public org.museframework.bian.paymentinitiation.dto.bq.Compliance getCompliance() {
        return compliance;
    }
}