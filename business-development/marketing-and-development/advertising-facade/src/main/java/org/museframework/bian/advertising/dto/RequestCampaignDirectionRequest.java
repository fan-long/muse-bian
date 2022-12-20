package org.museframework.bian.advertising.dto;

public class RequestCampaignDirectionRequest {
    private String advertisingid;

    private String campaigndirectionid;

    private org.museframework.bian.advertising.dto.bq.CampaignDirection campaignDirection;

    public void setAdvertisingid(String advertisingid) {
        this.advertisingid = advertisingid;
    }

    public String getAdvertisingid() {
        return advertisingid;
    }

    public void setCampaigndirectionid(String campaigndirectionid) {
        this.campaigndirectionid = campaigndirectionid;
    }

    public String getCampaigndirectionid() {
        return campaigndirectionid;
    }

    public void setCampaignDirection(org.museframework.bian.advertising.dto.bq.CampaignDirection campaignDirection) {
        this.campaignDirection = campaignDirection;
    }

    public org.museframework.bian.advertising.dto.bq.CampaignDirection getCampaignDirection() {
        return campaignDirection;
    }
}