package org.museframework.bian.customerportfolio.dto;

public class EvaluateCustomerSegmentAnalysisRequest {
    private org.museframework.bian.customerportfolio.dto.cr.CustomerSegmentAnalysis customerSegmentAnalysis;

    public void setCustomerSegmentAnalysis(org.museframework.bian.customerportfolio.dto.cr.CustomerSegmentAnalysis customerSegmentAnalysis) {
        this.customerSegmentAnalysis = customerSegmentAnalysis;
    }

    public org.museframework.bian.customerportfolio.dto.cr.CustomerSegmentAnalysis getCustomerSegmentAnalysis() {
        return customerSegmentAnalysis;
    }
}