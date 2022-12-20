package org.museframework.bian.customerportfolio.dto;

public class RetrievePerformanceAnalysisRequest {
    private String customerportfolioid;

    private String performanceanalysisid;

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
}