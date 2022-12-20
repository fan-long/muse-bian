package org.museframework.bian.advertising.dto;

public class RetrievePerformanceAssessmentResponse {
    private org.museframework.bian.advertising.dto.bq.PerformanceAssessment performanceAssessment;

    public void setPerformanceAssessment(org.museframework.bian.advertising.dto.bq.PerformanceAssessment performanceAssessment) {
        this.performanceAssessment = performanceAssessment;
    }

    public org.museframework.bian.advertising.dto.bq.PerformanceAssessment getPerformanceAssessment() {
        return performanceAssessment;
    }
}