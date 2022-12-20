package org.museframework.bian.procamman.dto;

public class CreateCampaignDirectionResponse {
    private org.museframework.bian.procamman.dto.bq.CampaignDirection campaignDirection;

    public void setCampaignDirection(org.museframework.bian.procamman.dto.bq.CampaignDirection campaignDirection) {
        this.campaignDirection = campaignDirection;
    }

    public org.museframework.bian.procamman.dto.bq.CampaignDirection getCampaignDirection() {
        return campaignDirection;
    }
}