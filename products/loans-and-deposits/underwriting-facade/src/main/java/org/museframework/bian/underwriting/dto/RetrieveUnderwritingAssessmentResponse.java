package org.museframework.bian.underwriting.dto;

public class RetrieveUnderwritingAssessmentResponse {
    private org.museframework.bian.underwriting.dto.cr.UnderwritingAssessment underwritingAssessment;

    public void setUnderwritingAssessment(org.museframework.bian.underwriting.dto.cr.UnderwritingAssessment underwritingAssessment) {
        this.underwritingAssessment = underwritingAssessment;
    }

    public org.museframework.bian.underwriting.dto.cr.UnderwritingAssessment getUnderwritingAssessment() {
        return underwritingAssessment;
    }
}