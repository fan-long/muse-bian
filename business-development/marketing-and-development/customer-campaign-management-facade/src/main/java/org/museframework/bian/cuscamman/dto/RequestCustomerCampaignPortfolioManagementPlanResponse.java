package org.museframework.bian.cuscamman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestCustomerCampaignPortfolioManagementPlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cuscamman.dto.cr.CustomerCampaignPortfolioManagementPlan customerCampaignPortfolioManagementPlan;

    public void setCustomerCampaignPortfolioManagementPlan(org.museframework.bian.cuscamman.dto.cr.CustomerCampaignPortfolioManagementPlan customerCampaignPortfolioManagementPlan) {
        this.customerCampaignPortfolioManagementPlan = customerCampaignPortfolioManagementPlan;
    }

    public org.museframework.bian.cuscamman.dto.cr.CustomerCampaignPortfolioManagementPlan getCustomerCampaignPortfolioManagementPlan() {
        return customerCampaignPortfolioManagementPlan;
    }
}