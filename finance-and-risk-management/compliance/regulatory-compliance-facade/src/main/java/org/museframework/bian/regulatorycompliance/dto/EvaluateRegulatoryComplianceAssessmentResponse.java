package org.museframework.bian.regulatorycompliance.dto;

public class EvaluateRegulatoryComplianceAssessmentResponse {
    private org.museframework.bian.regulatorycompliance.dto.cr.RegulatoryComplianceAssessment regulatoryComplianceAssessment;

    public void setRegulatoryComplianceAssessment(org.museframework.bian.regulatorycompliance.dto.cr.RegulatoryComplianceAssessment regulatoryComplianceAssessment) {
        this.regulatoryComplianceAssessment = regulatoryComplianceAssessment;
    }

    public org.museframework.bian.regulatorycompliance.dto.cr.RegulatoryComplianceAssessment getRegulatoryComplianceAssessment() {
        return regulatoryComplianceAssessment;
    }
}