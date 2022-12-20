package org.museframework.bian.procamman.dto;

public class RequestProspectCampaignPortfolioManagementPlanRequest {
    private String prospectcampaignmanagementid;

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