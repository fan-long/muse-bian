/*The configuration and execution of Cash Position Monitoring and Transfer Fulfillment arrangement within the Cash Position Monitoring and Transfer Fulfillment*/
package org.museframework.bian.cashconcentration.dto.bq;

public class CashConcentrationOutcome {
    /**/
    private org.museframework.bian.classes.FinancialFacility cashConcentrationFinancialFacility;

    /**/
    private String cashConcentrationWorkProduct;

    public void setCashConcentrationFinancialFacility(org.museframework.bian.classes.FinancialFacility cashConcentrationFinancialFacility) {
        this.cashConcentrationFinancialFacility = cashConcentrationFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getCashConcentrationFinancialFacility() {
        return cashConcentrationFinancialFacility;
    }

    public void setCashConcentrationWorkProduct(String cashConcentrationWorkProduct) {
        this.cashConcentrationWorkProduct = cashConcentrationWorkProduct;
    }

    public String getCashConcentrationWorkProduct() {
        return cashConcentrationWorkProduct;
    }
}