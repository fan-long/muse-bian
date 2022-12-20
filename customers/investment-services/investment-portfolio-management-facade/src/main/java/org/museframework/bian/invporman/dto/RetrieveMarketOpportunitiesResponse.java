package org.museframework.bian.invporman.dto;

public class RetrieveMarketOpportunitiesResponse {
    private org.museframework.bian.invporman.dto.bq.MarketOpportunities marketOpportunities;

    public void setMarketOpportunities(org.museframework.bian.invporman.dto.bq.MarketOpportunities marketOpportunities) {
        this.marketOpportunities = marketOpportunities;
    }

    public org.museframework.bian.invporman.dto.bq.MarketOpportunities getMarketOpportunities() {
        return marketOpportunities;
    }
}