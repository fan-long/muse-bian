package org.museframework.bian.procamman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestProspectCampaignPortfolioManagementPlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.procamman.dto.cr.ProspectCampaignPortfolioManagementPlan prospectCampaignPortfolioManagementPlan;

    public void setProspectCampaignPortfolioManagementPlan(org.museframework.bian.procamman.dto.cr.ProspectCampaignPortfolioManagementPlan prospectCampaignPortfolioManagementPlan) {
        this.prospectCampaignPortfolioManagementPlan = prospectCampaignPortfolioManagementPlan;
    }

    public org.museframework.bian.procamman.dto.cr.ProspectCampaignPortfolioManagementPlan getProspectCampaignPortfolioManagementPlan() {
        return prospectCampaignPortfolioManagementPlan;
    }
}