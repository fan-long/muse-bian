package org.museframework.bian.productportfolio.dto;

public class UpdatePerformanceAnalysisRequest {
    private String productportfolioid;

    private String performanceanalysisid;

    private org.museframework.bian.productportfolio.dto.bq.PerformanceAnalysis performanceAnalysis;

    public void setProductportfolioid(String productportfolioid) {
        this.productportfolioid = productportfolioid;
    }

    public String getProductportfolioid() {
        return productportfolioid;
    }

    public void setPerformanceanalysisid(String performanceanalysisid) {
        this.performanceanalysisid = performanceanalysisid;
    }

    public String getPerformanceanalysisid() {
        return performanceanalysisid;
    }

    public void setPerformanceAnalysis(org.museframework.bian.productportfolio.dto.bq.PerformanceAnalysis performanceAnalysis) {
        this.performanceAnalysis = performanceAnalysis;
    }

    public org.museframework.bian.productportfolio.dto.bq.PerformanceAnalysis getPerformanceAnalysis() {
        return performanceAnalysis;
    }
}