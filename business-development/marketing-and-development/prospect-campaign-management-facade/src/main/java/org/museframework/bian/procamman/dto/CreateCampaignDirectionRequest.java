package org.museframework.bian.procamman.dto;

public class CreateCampaignDirectionRequest {
    private String prospectcampaignmanagementid;

    private String campaigndirectionid;

    private org.museframework.bian.procamman.dto.bq.CampaignDirection campaignDirection;

    public void setProspectcampaignmanagementid(String prospectcampaignmanagementid) {
        this.prospectcampaignmanagementid = prospectcampaignmanagementid;
    }

    public String getProspectcampaignmanagementid() {
        return prospectcampaignmanagementid;
    }

    public void setCampaigndirectionid(String campaigndirectionid) {
        this.campaigndirectionid = campaigndirectionid;
    }

    public String getCampaigndirectionid() {
        return campaigndirectionid;
    }

    public void setCampaignDirection(org.museframework.bian.procamman.dto.bq.CampaignDirection campaignDirection) {
        this.campaignDirection = campaignDirection;
    }

    public org.museframework.bian.procamman.dto.bq.CampaignDirection getCampaignDirection() {
        return campaignDirection;
    }
}