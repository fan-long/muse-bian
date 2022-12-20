package org.museframework.bian.legalcompliance.dto;

public class RequestLegalComplianceAssessmentRequest {
    private String legalcomplianceid;

    private org.museframework.bian.legalcompliance.dto.cr.LegalComplianceAssessment legalComplianceAssessment;

    public void setLegalcomplianceid(String legalcomplianceid) {
        this.legalcomplianceid = legalcomplianceid;
    }

    public String getLegalcomplianceid() {
        return legalcomplianceid;
    }

    public void setLegalComplianceAssessment(org.museframework.bian.legalcompliance.dto.cr.LegalComplianceAssessment legalComplianceAssessment) {
        this.legalComplianceAssessment = legalComplianceAssessment;
    }

    public org.museframework.bian.legalcompliance.dto.cr.LegalComplianceAssessment getLegalComplianceAssessment() {
        return legalComplianceAssessment;
    }
}