/*The configuration and execution of Standing Order Fulfillment arrangement within the Standing Order Fulfillment*/
package org.museframework.bian.standingorder.dto.bq;

public class StandingOrderOutcome {
    /**/
    private String standingOrderFinancialFacility;

    public void setStandingOrderFinancialFacility(String standingOrderFinancialFacility) {
        this.standingOrderFinancialFacility = standingOrderFinancialFacility;
    }

    public String getStandingOrderFinancialFacility() {
        return standingOrderFinancialFacility;
    }
}