package org.museframework.bian.marketmaking.dto;

public class ExchangeMarketMakingFacilityRequest {
    private String marketmakingid;

    private org.museframework.bian.marketmaking.dto.cr.MarketMakingFacility marketMakingFacility;

    public void setMarketmakingid(String marketmakingid) {
        this.marketmakingid = marketmakingid;
    }

    public String getMarketmakingid() {
        return marketmakingid;
    }

    public void setMarketMakingFacility(org.museframework.bian.marketmaking.dto.cr.MarketMakingFacility marketMakingFacility) {
        this.marketMakingFacility = marketMakingFacility;
    }

    public org.museframework.bian.marketmaking.dto.cr.MarketMakingFacility getMarketMakingFacility() {
        return marketMakingFacility;
    }
}