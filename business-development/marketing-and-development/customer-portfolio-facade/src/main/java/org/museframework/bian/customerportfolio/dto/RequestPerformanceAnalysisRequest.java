package org.museframework.bian.customerportfolio.dto;

public class RequestPerformanceAnalysisRequest {
    private String customerportfolioid;

    private String performanceanalysisid;

    private org.museframework.bian.customerportfolio.dto.bq.PerformanceAnalysis performanceAnalysis;

    public void setCustomerportfolioid(String customerportfolioid) {
        this.customerportfolioid = customerportfolioid;
    }

    public String getCustomerportfolioid() {
        return customerportfolioid;
    }

    public void setPerformanceanalysisid(String performanceanalysisid) {
        this.performanceanalysisid = performanceanalysisid;
    }

    public String getPerformanceanalysisid() {
        return performanceanalysisid;
    }

    public void setPerformanceAnalysis(org.museframework.bian.customerportfolio.dto.bq.PerformanceAnalysis performanceAnalysis) {
        this.performanceAnalysis = performanceAnalysis;
    }

    public org.museframework.bian.customerportfolio.dto.bq.PerformanceAnalysis getPerformanceAnalysis() {
        return performanceAnalysis;
    }
}