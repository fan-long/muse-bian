package org.museframework.bian.procamman.dto;

public class UpdateMarketTrackingRequest {
    private String prospectcampaignmanagementid;

    private String markettrackingid;

    private org.museframework.bian.procamman.dto.bq.MarketTracking marketTracking;

    public void setProspectcampaignmanagementid(String prospectcampaignmanagementid) {
        this.prospectcampaignmanagementid = prospectcampaignmanagementid;
    }

    public String getProspectcampaignmanagementid() {
        return prospectcampaignmanagementid;
    }

    public void setMarkettrackingid(String markettrackingid) {
        this.markettrackingid = markettrackingid;
    }

    public String getMarkettrackingid() {
        return markettrackingid;
    }

    public void setMarketTracking(org.museframework.bian.procamman.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.procamman.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}