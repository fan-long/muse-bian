package org.museframework.bian.cuscamman.dto;

public class UpdateCampaignDirectionRequest {
    private String customercampaignmanagementid;

    private String campaigndirectionid;

    private org.museframework.bian.cuscamman.dto.bq.CampaignDirection campaignDirection;

    public void setCustomercampaignmanagementid(String customercampaignmanagementid) {
        this.customercampaignmanagementid = customercampaignmanagementid;
    }

    public String getCustomercampaignmanagementid() {
        return customercampaignmanagementid;
    }

    public void setCampaigndirectionid(String campaigndirectionid) {
        this.campaigndirectionid = campaigndirectionid;
    }

    public String getCampaigndirectionid() {
        return campaigndirectionid;
    }

    public void setCampaignDirection(org.museframework.bian.cuscamman.dto.bq.CampaignDirection campaignDirection) {
        this.campaignDirection = campaignDirection;
    }

    public org.museframework.bian.cuscamman.dto.bq.CampaignDirection getCampaignDirection() {
        return campaignDirection;
    }
}