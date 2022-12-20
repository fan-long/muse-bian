package org.museframework.bian.consumerinvestments.dto;

public class RetrieveComplianceResponse {
    private org.museframework.bian.consumerinvestments.dto.bq.Compliance compliance;

    public void setCompliance(org.museframework.bian.consumerinvestments.dto.bq.Compliance compliance) {
        this.compliance = compliance;
    }

    public org.museframework.bian.consumerinvestments.dto.bq.Compliance getCompliance() {
        return compliance;
    }
}