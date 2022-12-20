package org.museframework.bian.cuscamman.dto;

public class RequestCampaignDirectionResponse {
    private org.museframework.bian.cuscamman.dto.bq.CampaignDirection campaignDirection;

    public void setCampaignDirection(org.museframework.bian.cuscamman.dto.bq.CampaignDirection campaignDirection) {
        this.campaignDirection = campaignDirection;
    }

    public org.museframework.bian.cuscamman.dto.bq.CampaignDirection getCampaignDirection() {
        return campaignDirection;
    }
}