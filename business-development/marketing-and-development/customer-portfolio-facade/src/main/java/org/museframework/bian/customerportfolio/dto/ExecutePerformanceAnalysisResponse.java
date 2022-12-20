package org.museframework.bian.customerportfolio.dto;

public class ExecutePerformanceAnalysisResponse {
    private org.museframework.bian.customerportfolio.dto.bq.PerformanceAnalysis performanceAnalysis;

    public void setPerformanceAnalysis(org.museframework.bian.customerportfolio.dto.bq.PerformanceAnalysis performanceAnalysis) {
        this.performanceAnalysis = performanceAnalysis;
    }

    public org.museframework.bian.customerportfolio.dto.bq.PerformanceAnalysis getPerformanceAnalysis() {
        return performanceAnalysis;
    }
}