package org.museframework.bian.cuscamman.dto;

public class UpdateMarketTrackingRequest {
    private String customercampaignmanagementid;

    private String markettrackingid;

    private org.museframework.bian.cuscamman.dto.bq.MarketTracking marketTracking;

    public void setCustomercampaignmanagementid(String customercampaignmanagementid) {
        this.customercampaignmanagementid = customercampaignmanagementid;
    }

    public String getCustomercampaignmanagementid() {
        return customercampaignmanagementid;
    }

    public void setMarkettrackingid(String markettrackingid) {
        this.markettrackingid = markettrackingid;
    }

    public String getMarkettrackingid() {
        return markettrackingid;
    }

    public void setMarketTracking(org.museframework.bian.cuscamman.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.cuscamman.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}