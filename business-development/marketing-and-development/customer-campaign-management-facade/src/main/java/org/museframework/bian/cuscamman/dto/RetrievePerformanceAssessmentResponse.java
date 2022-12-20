package org.museframework.bian.cuscamman.dto;

public class RetrievePerformanceAssessmentResponse {
    private org.museframework.bian.cuscamman.dto.bq.PerformanceAssessment performanceAssessment;

    public void setPerformanceAssessment(org.museframework.bian.cuscamman.dto.bq.PerformanceAssessment performanceAssessment) {
        this.performanceAssessment = performanceAssessment;
    }

    public org.museframework.bian.cuscamman.dto.bq.PerformanceAssessment getPerformanceAssessment() {
        return performanceAssessment;
    }
}