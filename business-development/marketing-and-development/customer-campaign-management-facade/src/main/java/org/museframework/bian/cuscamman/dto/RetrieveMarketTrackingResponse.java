package org.museframework.bian.cuscamman.dto;

public class RetrieveMarketTrackingResponse {
    private org.museframework.bian.cuscamman.dto.bq.MarketTracking marketTracking;

    public void setMarketTracking(org.museframework.bian.cuscamman.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.cuscamman.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}