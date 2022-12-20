package org.museframework.bian.cuscamman.dto;

public class RetrieveMarketTrackingRequest {
    private String customercampaignmanagementid;

    private String markettrackingid;

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
}