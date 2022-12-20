package org.museframework.bian.advertising.dto;

public class CreatePerformanceAssessmentRequest {
    private String advertisingid;

    private String performanceassessmentid;

    private org.museframework.bian.advertising.dto.bq.PerformanceAssessment performanceAssessment;

    public void setAdvertisingid(String advertisingid) {
        this.advertisingid = advertisingid;
    }

    public String getAdvertisingid() {
        return advertisingid;
    }

    public void setPerformanceassessmentid(String performanceassessmentid) {
        this.performanceassessmentid = performanceassessmentid;
    }

    public String getPerformanceassessmentid() {
        return performanceassessmentid;
    }

    public void setPerformanceAssessment(org.museframework.bian.advertising.dto.bq.PerformanceAssessment performanceAssessment) {
        this.performanceAssessment = performanceAssessment;
    }

    public org.museframework.bian.advertising.dto.bq.PerformanceAssessment getPerformanceAssessment() {
        return performanceAssessment;
    }
}