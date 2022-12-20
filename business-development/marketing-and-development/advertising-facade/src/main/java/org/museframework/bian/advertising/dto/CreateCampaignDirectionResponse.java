package org.museframework.bian.advertising.dto;

public class CreateCampaignDirectionResponse {
    private org.museframework.bian.advertising.dto.bq.CampaignDirection campaignDirection;

    public void setCampaignDirection(org.museframework.bian.advertising.dto.bq.CampaignDirection campaignDirection) {
        this.campaignDirection = campaignDirection;
    }

    public org.museframework.bian.advertising.dto.bq.CampaignDirection getCampaignDirection() {
        return campaignDirection;
    }
}