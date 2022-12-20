package org.museframework.bian.advertising.dto;

public class RequestMarketTrackingRequest {
    private String advertisingid;

    private String markettrackingid;

    private org.museframework.bian.advertising.dto.bq.MarketTracking marketTracking;

    public void setAdvertisingid(String advertisingid) {
        this.advertisingid = advertisingid;
    }

    public String getAdvertisingid() {
        return advertisingid;
    }

    public void setMarkettrackingid(String markettrackingid) {
        this.markettrackingid = markettrackingid;
    }

    public String getMarkettrackingid() {
        return markettrackingid;
    }

    public void setMarketTracking(org.museframework.bian.advertising.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.advertising.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}