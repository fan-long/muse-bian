package org.museframework.bian.fiduciaryagreement.dto;

public class RetrieveAssessmentandReportingRequest {
    private String fiduciaryagreementid;

    private String assessmentandreportingid;

    public void setFiduciaryagreementid(String fiduciaryagreementid) {
        this.fiduciaryagreementid = fiduciaryagreementid;
    }

    public String getFiduciaryagreementid() {
        return fiduciaryagreementid;
    }

    public void setAssessmentandreportingid(String assessmentandreportingid) {
        this.assessmentandreportingid = assessmentandreportingid;
    }

    public String getAssessmentandreportingid() {
        return assessmentandreportingid;
    }
}