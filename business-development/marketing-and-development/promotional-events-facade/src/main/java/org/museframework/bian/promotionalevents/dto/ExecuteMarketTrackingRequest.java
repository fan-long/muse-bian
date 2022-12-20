package org.museframework.bian.promotionalevents.dto;

public class ExecuteMarketTrackingRequest {
    private String promotionaleventsid;

    private String markettrackingid;

    private org.museframework.bian.promotionalevents.dto.bq.MarketTracking marketTracking;

    public void setPromotionaleventsid(String promotionaleventsid) {
        this.promotionaleventsid = promotionaleventsid;
    }

    public String getPromotionaleventsid() {
        return promotionaleventsid;
    }

    public void setMarkettrackingid(String markettrackingid) {
        this.markettrackingid = markettrackingid;
    }

    public String getMarkettrackingid() {
        return markettrackingid;
    }

    public void setMarketTracking(org.museframework.bian.promotionalevents.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.promotionalevents.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}