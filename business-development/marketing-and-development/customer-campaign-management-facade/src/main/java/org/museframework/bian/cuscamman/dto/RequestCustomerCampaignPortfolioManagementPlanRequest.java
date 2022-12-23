package org.museframework.bian.cuscamman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestCustomerCampaignPortfolioManagementPlanRequest {
    @MetaField
    private String customercampaignmanagementid;

    @MetaField(ref=true)
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