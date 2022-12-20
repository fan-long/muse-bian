package org.museframework.bian.procamman.dto;

public class RetrieveMarketTrackingResponse {
    private org.museframework.bian.procamman.dto.bq.MarketTracking marketTracking;

    public void setMarketTracking(org.museframework.bian.procamman.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.procamman.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}