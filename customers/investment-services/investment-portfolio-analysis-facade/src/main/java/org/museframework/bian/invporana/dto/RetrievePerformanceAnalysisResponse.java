package org.museframework.bian.invporana.dto;

public class RetrievePerformanceAnalysisResponse {
    private org.museframework.bian.invporana.dto.bq.PerformanceAnalysis performanceAnalysis;

    public void setPerformanceAnalysis(org.museframework.bian.invporana.dto.bq.PerformanceAnalysis performanceAnalysis) {
        this.performanceAnalysis = performanceAnalysis;
    }

    public org.museframework.bian.invporana.dto.bq.PerformanceAnalysis getPerformanceAnalysis() {
        return performanceAnalysis;
    }
}