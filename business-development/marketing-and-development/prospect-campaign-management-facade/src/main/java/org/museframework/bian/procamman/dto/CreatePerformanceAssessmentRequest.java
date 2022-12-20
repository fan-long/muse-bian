package org.museframework.bian.procamman.dto;

public class CreatePerformanceAssessmentRequest {
    private String prospectcampaignmanagementid;

    private String performanceassessmentid;

    private org.museframework.bian.procamman.dto.bq.PerformanceAssessment performanceAssessment;

    public void setProspectcampaignmanagementid(String prospectcampaignmanagementid) {
        this.prospectcampaignmanagementid = prospectcampaignmanagementid;
    }

    public String getProspectcampaignmanagementid() {
        return prospectcampaignmanagementid;
    }

    public void setPerformanceassessmentid(String performanceassessmentid) {
        this.performanceassessmentid = performanceassessmentid;
    }

    public String getPerformanceassessmentid() {
        return performanceassessmentid;
    }

    public void setPerformanceAssessment(org.museframework.bian.procamman.dto.bq.PerformanceAssessment performanceAssessment) {
        this.performanceAssessment = performanceAssessment;
    }

    public org.museframework.bian.procamman.dto.bq.PerformanceAssessment getPerformanceAssessment() {
        return performanceAssessment;
    }
}