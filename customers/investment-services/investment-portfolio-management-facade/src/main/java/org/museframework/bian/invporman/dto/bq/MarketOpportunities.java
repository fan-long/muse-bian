/*The product features/services available with a financical facility*/
package org.museframework.bian.invporman.dto.bq;

public class MarketOpportunities {
    /*Description of the detected market opportunity (e.g. projected movement of an eligible security that is not currently held)*/
    private String marketOpportunityDescription;

    /*Evaluation of the comparative performance of identified security and that in the investment portfolio that would be replaced/adjusted*/
    private String securitiesComparison;

    public void setMarketOpportunityDescription(String marketOpportunityDescription) {
        this.marketOpportunityDescription = marketOpportunityDescription;
    }

    public String getMarketOpportunityDescription() {
        return marketOpportunityDescription;
    }

    public void setSecuritiesComparison(String securitiesComparison) {
        this.securitiesComparison = securitiesComparison;
    }

    public String getSecuritiesComparison() {
        return securitiesComparison;
    }
}