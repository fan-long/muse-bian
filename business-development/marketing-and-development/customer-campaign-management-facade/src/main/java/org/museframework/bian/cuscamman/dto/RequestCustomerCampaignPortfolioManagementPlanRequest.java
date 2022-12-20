package org.museframework.bian.cuscamman.dto;

public class RequestCustomerCampaignPortfolioManagementPlanRequest {
    private String customercampaignmanagementid;

    private org.museframework.bian.cuscamman.dto.cr.CustomerCampaignPortfolioManagementPlan customerCampaignPortfolioManagementPlan;

    public void setCustomercampaignmanagementid(String customercampaignmanagementid) {
        this.customercampaignmanagementid = customercampaignmanagementid;
    }

    public String getCustomercampaignmanagementid() {
        return customercampaignmanagementid;
    }

    public void setCustomerCampaignPortfolioManagementPlan(org.museframework.bian.cuscamman.dto.cr.CustomerCampaignPortfolioManagementPlan customerCampaignPortfolioManagementPlan) {
        this.customerCampaignPortfolioManagementPlan = customerCampaignPortfolioManagementPlan;
    }

    public org.museframework.bian.cuscamman.dto.cr.CustomerCampaignPortfolioManagementPlan getCustomerCampaignPortfolioManagementPlan() {
        return customerCampaignPortfolioManagementPlan;
    }
}