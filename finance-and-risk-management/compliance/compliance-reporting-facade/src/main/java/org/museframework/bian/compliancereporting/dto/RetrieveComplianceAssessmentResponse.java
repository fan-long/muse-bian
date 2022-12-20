package org.museframework.bian.compliancereporting.dto;

public class RetrieveComplianceAssessmentResponse {
    private org.museframework.bian.compliancereporting.dto.bq.ComplianceAssessment complianceAssessment;

    public void setComplianceAssessment(org.museframework.bian.compliancereporting.dto.bq.ComplianceAssessment complianceAssessment) {
        this.complianceAssessment = complianceAssessment;
    }

    public org.museframework.bian.compliancereporting.dto.bq.ComplianceAssessment getComplianceAssessment() {
        return complianceAssessment;
    }
}