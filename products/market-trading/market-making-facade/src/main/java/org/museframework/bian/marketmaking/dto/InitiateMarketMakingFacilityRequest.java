package org.museframework.bian.marketmaking.dto;

public class InitiateMarketMakingFacilityRequest {
    private org.museframework.bian.marketmaking.dto.cr.MarketMakingFacility marketMakingFacility;

    public void setMarketMakingFacility(org.museframework.bian.marketmaking.dto.cr.MarketMakingFacility marketMakingFacility) {
        this.marketMakingFacility = marketMakingFacility;
    }

    public org.museframework.bian.marketmaking.dto.cr.MarketMakingFacility getMarketMakingFacility() {
        return marketMakingFacility;
    }
}