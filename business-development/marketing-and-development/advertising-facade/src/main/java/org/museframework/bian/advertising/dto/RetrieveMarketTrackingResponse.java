package org.museframework.bian.advertising.dto;

public class RetrieveMarketTrackingResponse {
    private org.museframework.bian.advertising.dto.bq.MarketTracking marketTracking;

    public void setMarketTracking(org.museframework.bian.advertising.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.advertising.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}