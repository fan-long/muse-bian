package org.museframework.bian.legalcompliance.dto;

public class RetrieveLegalComplianceAssessmentResponse {
    private org.museframework.bian.legalcompliance.dto.cr.LegalComplianceAssessment legalComplianceAssessment;

    public void setLegalComplianceAssessment(org.museframework.bian.legalcompliance.dto.cr.LegalComplianceAssessment legalComplianceAssessment) {
        this.legalComplianceAssessment = legalComplianceAssessment;
    }

    public org.museframework.bian.legalcompliance.dto.cr.LegalComplianceAssessment getLegalComplianceAssessment() {
        return legalComplianceAssessment;
    }
}