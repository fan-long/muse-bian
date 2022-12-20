/*The configuration and execution of Account Receivable Factoring Fulfillment arrangement within the Account Receivable Factoring Fulfillment*/
package org.museframework.bian.factoring.dto.bq;

public class FactoringOutcome {
    /**/
    private org.museframework.bian.classes.FinancialFacility factoringFinancialFacility;

    /**/
    private String factoringWorkProduct;

    public void setFactoringFinancialFacility(org.museframework.bian.classes.FinancialFacility factoringFinancialFacility) {
        this.factoringFinancialFacility = factoringFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getFactoringFinancialFacility() {
        return factoringFinancialFacility;
    }

    public void setFactoringWorkProduct(String factoringWorkProduct) {
        this.factoringWorkProduct = factoringWorkProduct;
    }

    public String getFactoringWorkProduct() {
        return factoringWorkProduct;
    }
}