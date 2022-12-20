package org.museframework.bian.cuscamman.dto;

public class ExecutePerformanceAssessmentRequest {
    private String customercampaignmanagementid;

    private String performanceassessmentid;

    private org.museframework.bian.cuscamman.dto.bq.PerformanceAssessment performanceAssessment;

    public void setCustomercampaignmanagementid(String customercampaignmanagementid) {
        this.customercampaignmanagementid = customercampaignmanagementid;
    }

    public String getCustomercampaignmanagementid() {
        return customercampaignmanagementid;
    }

    public void setPerformanceassessmentid(String performanceassessmentid) {
        this.performanceassessmentid = performanceassessmentid;
    }

    public String getPerformanceassessmentid() {
        return performanceassessmentid;
    }

    public void setPerformanceAssessment(org.museframework.bian.cuscamman.dto.bq.PerformanceAssessment performanceAssessment) {
        this.performanceAssessment = performanceAssessment;
    }

    public org.museframework.bian.cuscamman.dto.bq.PerformanceAssessment getPerformanceAssessment() {
        return performanceAssessment;
    }
}