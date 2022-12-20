package org.museframework.bian.productportfolio.dto;

public class RequestPerformanceAnalysisResponse {
    private org.museframework.bian.productportfolio.dto.bq.PerformanceAnalysis performanceAnalysis;

    public void setPerformanceAnalysis(org.museframework.bian.productportfolio.dto.bq.PerformanceAnalysis performanceAnalysis) {
        this.performanceAnalysis = performanceAnalysis;
    }

    public org.museframework.bian.productportfolio.dto.bq.PerformanceAnalysis getPerformanceAnalysis() {
        return performanceAnalysis;
    }
}