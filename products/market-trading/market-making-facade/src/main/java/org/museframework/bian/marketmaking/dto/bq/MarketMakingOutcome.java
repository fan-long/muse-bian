/*The configuration and execution of Market Making Security Traded Position Fulfillment arrangement within the Market Making Security Traded Position Fulfillment*/
package org.museframework.bian.marketmaking.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MarketMakingOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility marketMakingFinancialFacility;

    /**/
    @MetaField(0)
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