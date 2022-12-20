package org.museframework.bian.suitabilitychecking.dto;

public class RequestSuitabilityAssessmentRequest {
    private String suitabilitycheckingid;

    private org.museframework.bian.suitabilitychecking.dto.cr.SuitabilityAssessment suitabilityAssessment;

    public void setSuitabilitycheckingid(String suitabilitycheckingid) {
        this.suitabilitycheckingid = suitabilitycheckingid;
    }

    public String getSuitabilitycheckingid() {
        return suitabilitycheckingid;
    }

    public void setSuitabilityAssessment(org.museframework.bian.suitabilitychecking.dto.cr.SuitabilityAssessment suitabilityAssessment) {
        this.suitabilityAssessment = suitabilityAssessment;
    }

    public org.museframework.bian.suitabilitychecking.dto.cr.SuitabilityAssessment getSuitabilityAssessment() {
        return suitabilityAssessment;
    }
}