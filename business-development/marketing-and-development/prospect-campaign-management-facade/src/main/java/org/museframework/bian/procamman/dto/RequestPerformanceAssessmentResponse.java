package org.museframework.bian.procamman.dto;

public class RequestPerformanceAssessmentResponse {
    private org.museframework.bian.procamman.dto.bq.PerformanceAssessment performanceAssessment;

    public void setPerformanceAssessment(org.museframework.bian.procamman.dto.bq.PerformanceAssessment performanceAssessment) {
        this.performanceAssessment = performanceAssessment;
    }

    public org.museframework.bian.procamman.dto.bq.PerformanceAssessment getPerformanceAssessment() {
        return performanceAssessment;
    }
}