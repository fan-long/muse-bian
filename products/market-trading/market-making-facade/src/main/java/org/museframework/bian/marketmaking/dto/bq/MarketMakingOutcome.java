/*The configuration and execution of Market Making Security Traded Position Fulfillment arrangement within the Market Making Security Traded Position Fulfillment*/
package org.museframework.bian.marketmaking.dto.bq;

public class MarketMakingOutcome {
    /**/
    private org.museframework.bian.classes.FinancialFacility marketMakingFinancialFacility;

    /**/
    private String marketMakingWorkProduct;

    public void setMarketMakingFinancialFacility(org.museframework.bian.classes.FinancialFacility marketMakingFinancialFacility) {
        this.marketMakingFinancialFacility = marketMakingFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getMarketMakingFinancialFacility() {
        return marketMakingFinancialFacility;
    }

    public void setMarketMakingWorkProduct(String marketMakingWorkProduct) {
        this.marketMakingWorkProduct = marketMakingWorkProduct;
    }

    public String getMarketMakingWorkProduct() {
        return marketMakingWorkProduct;
    }
}