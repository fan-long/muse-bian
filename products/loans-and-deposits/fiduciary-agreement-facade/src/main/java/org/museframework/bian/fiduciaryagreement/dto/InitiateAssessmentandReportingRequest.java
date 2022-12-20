package org.museframework.bian.fiduciaryagreement.dto;

public class InitiateAssessmentandReportingRequest {
    private String fiduciaryagreementid;

    private String assessmentandreportingid;

    private org.museframework.bian.fiduciaryagreement.dto.bq.AssessmentandReporting assessmentandReporting;

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

    public void setAssessmentandReporting(org.museframework.bian.fiduciaryagreement.dto.bq.AssessmentandReporting assessmentandReporting) {
        this.assessmentandReporting = assessmentandReporting;
    }

    public org.museframework.bian.fiduciaryagreement.dto.bq.AssessmentandReporting getAssessmentandReporting() {
        return assessmentandReporting;
    }
}