package org.museframework.bian.customerportfolio.dto;

public class UpdateCustomerSegmentAnalysisRequest {
    private String customerportfolioid;

    private org.museframework.bian.customerportfolio.dto.cr.CustomerSegmentAnalysis customerSegmentAnalysis;

    public void setCustomerportfolioid(String customerportfolioid) {
        this.customerportfolioid = customerportfolioid;
    }

    public String getCustomerportfolioid() {
        return customerportfolioid;
    }

    public void setCustomerSegmentAnalysis(org.museframework.bian.customerportfolio.dto.cr.CustomerSegmentAnalysis customerSegmentAnalysis) {
        this.customerSegmentAnalysis = customerSegmentAnalysis;
    }

    public org.museframework.bian.customerportfolio.dto.cr.CustomerSegmentAnalysis getCustomerSegmentAnalysis() {
        return customerSegmentAnalysis;
    }
}