package org.museframework.bian.cuscasman.dto;

public class RequestCustomerCaseManagementPlanRequest {
    private String customercasemanagementid;

    private org.museframework.bian.cuscasman.dto.cr.CustomerCaseManagementPlan customerCaseManagementPlan;

    public void setCustomercasemanagementid(String customercasemanagementid) {
        this.customercasemanagementid = customercasemanagementid;
    }

    public String getCustomercasemanagementid() {
        return customercasemanagementid;
    }

    public void setCustomerCaseManagementPlan(org.museframework.bian.cuscasman.dto.cr.CustomerCaseManagementPlan customerCaseManagementPlan) {
        this.customerCaseManagementPlan = customerCaseManagementPlan;
    }

    public org.museframework.bian.cuscasman.dto.cr.CustomerCaseManagementPlan getCustomerCaseManagementPlan() {
        return customerCaseManagementPlan;
    }
}