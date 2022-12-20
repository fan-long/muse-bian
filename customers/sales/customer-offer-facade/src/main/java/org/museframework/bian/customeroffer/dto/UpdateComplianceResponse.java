package org.museframework.bian.customeroffer.dto;

public class UpdateComplianceResponse {
    private org.museframework.bian.customeroffer.dto.bq.Compliance compliance;

    public void setCompliance(org.museframework.bian.customeroffer.dto.bq.Compliance compliance) {
        this.compliance = compliance;
    }

    public org.museframework.bian.customeroffer.dto.bq.Compliance getCompliance() {
        return compliance;
    }
}