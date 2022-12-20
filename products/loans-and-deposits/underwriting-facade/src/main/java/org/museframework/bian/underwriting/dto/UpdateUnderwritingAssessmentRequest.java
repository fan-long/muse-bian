package org.museframework.bian.underwriting.dto;

public class UpdateUnderwritingAssessmentRequest {
    private String underwritingid;

    private org.museframework.bian.underwriting.dto.cr.UnderwritingAssessment underwritingAssessment;

    public void setUnderwritingid(String underwritingid) {
        this.underwritingid = underwritingid;
    }

    public String getUnderwritingid() {
        return underwritingid;
    }

    public void setUnderwritingAssessment(org.museframework.bian.underwriting.dto.cr.UnderwritingAssessment underwritingAssessment) {
        this.underwritingAssessment = underwritingAssessment;
    }

    public org.museframework.bian.underwriting.dto.cr.UnderwritingAssessment getUnderwritingAssessment() {
        return underwritingAssessment;
    }
}