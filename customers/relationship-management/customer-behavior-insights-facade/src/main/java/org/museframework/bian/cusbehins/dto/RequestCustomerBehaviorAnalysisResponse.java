package org.museframework.bian.cusbehins.dto;

public class RequestCustomerBehaviorAnalysisResponse {
    private org.museframework.bian.cusbehins.dto.cr.CustomerBehaviorAnalysis customerBehaviorAnalysis;

    public void setCustomerBehaviorAnalysis(org.museframework.bian.cusbehins.dto.cr.CustomerBehaviorAnalysis customerBehaviorAnalysis) {
        this.customerBehaviorAnalysis = customerBehaviorAnalysis;
    }

    public org.museframework.bian.cusbehins.dto.cr.CustomerBehaviorAnalysis getCustomerBehaviorAnalysis() {
        return customerBehaviorAnalysis;
    }
}