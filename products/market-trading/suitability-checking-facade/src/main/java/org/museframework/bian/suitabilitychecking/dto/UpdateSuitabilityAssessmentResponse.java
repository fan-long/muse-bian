package org.museframework.bian.suitabilitychecking.dto;

public class UpdateSuitabilityAssessmentResponse {
    private org.museframework.bian.suitabilitychecking.dto.cr.SuitabilityAssessment suitabilityAssessment;

    public void setSuitabilityAssessment(org.museframework.bian.suitabilitychecking.dto.cr.SuitabilityAssessment suitabilityAssessment) {
        this.suitabilityAssessment = suitabilityAssessment;
    }

    public org.museframework.bian.suitabilitychecking.dto.cr.SuitabilityAssessment getSuitabilityAssessment() {
        return suitabilityAssessment;
    }
}