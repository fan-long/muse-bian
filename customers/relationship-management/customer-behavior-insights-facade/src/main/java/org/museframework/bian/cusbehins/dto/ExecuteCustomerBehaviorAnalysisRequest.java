package org.museframework.bian.cusbehins.dto;

public class ExecuteCustomerBehaviorAnalysisRequest {
    private String customerbehaviorinsightsid;

    private org.museframework.bian.cusbehins.dto.cr.CustomerBehaviorAnalysis customerBehaviorAnalysis;

    public void setCustomerbehaviorinsightsid(String customerbehaviorinsightsid) {
        this.customerbehaviorinsightsid = customerbehaviorinsightsid;
    }

    public String getCustomerbehaviorinsightsid() {
        return customerbehaviorinsightsid;
    }

    public void setCustomerBehaviorAnalysis(org.museframework.bian.cusbehins.dto.cr.CustomerBehaviorAnalysis customerBehaviorAnalysis) {
        this.customerBehaviorAnalysis = customerBehaviorAnalysis;
    }

    public org.museframework.bian.cusbehins.dto.cr.CustomerBehaviorAnalysis getCustomerBehaviorAnalysis() {
        return customerBehaviorAnalysis;
    }
}