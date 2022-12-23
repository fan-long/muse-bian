package org.museframework.bian.procamman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProspectCampaignPortfolioManagementPlanRequest {
    @MetaField
    private String prospectcampaignmanagementid;

    @MetaField(ref=true)
    private org.museframework.bian.procamman.dto.cr.ProspectCampaignPortfolioManagementPlan prospectCampaignPortfolioManagementPlan;

    public void setProspectcampaignmanagementid(String prospectcampaignmanagementid) {
        this.prospectcampaignmanagementid = prospectcampaignmanagementid;
    }

    public String getProspectcampaignmanagementid() {
        return prospectcampaignmanagementid;
    }

    public void setProspectCampaignPortfolioManagementPlan(org.museframework.bian.procamman.dto.cr.ProspectCampaignPortfolioManagementPlan prospectCampaignPortfolioManagementPlan) {
        this.prospectCampaignPortfolioManagementPlan = prospectCampaignPortfolioManagementPlan;
    }

    public org.museframework.bian.procamman.dto.cr.ProspectCampaignPortfolioManagementPlan getProspectCampaignPortfolioManagementPlan() {
        return prospectCampaignPortfolioManagementPlan;
    }
}