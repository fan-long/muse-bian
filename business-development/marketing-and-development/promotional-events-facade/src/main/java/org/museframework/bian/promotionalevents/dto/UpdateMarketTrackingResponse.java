package org.museframework.bian.promotionalevents.dto;

public class UpdateMarketTrackingResponse {
    private org.museframework.bian.promotionalevents.dto.bq.MarketTracking marketTracking;

    public void setMarketTracking(org.museframework.bian.promotionalevents.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.promotionalevents.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}