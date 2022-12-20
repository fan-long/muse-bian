package org.museframework.bian.guidelinecompliance.dto;

public class UpdateGuidelineComplianceAssessmentRequest {
    private String guidelinecomplianceid;

    private org.museframework.bian.guidelinecompliance.dto.cr.GuidelineComplianceAssessment guidelineComplianceAssessment;

    public void setGuidelinecomplianceid(String guidelinecomplianceid) {
        this.guidelinecomplianceid = guidelinecomplianceid;
    }

    public String getGuidelinecomplianceid() {
        return guidelinecomplianceid;
    }

    public void setGuidelineComplianceAssessment(org.museframework.bian.guidelinecompliance.dto.cr.GuidelineComplianceAssessment guidelineComplianceAssessment) {
        this.guidelineComplianceAssessment = guidelineComplianceAssessment;
    }

    public org.museframework.bian.guidelinecompliance.dto.cr.GuidelineComplianceAssessment getGuidelineComplianceAssessment() {
        return guidelineComplianceAssessment;
    }
}