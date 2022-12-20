/*The configuration and execution of Public Placement IPO and Underwriting Fulfillment arrangement within the Public Placement IPO and Underwriting Fulfillment*/
package org.museframework.bian.publicoffering.dto.bq;

public class PublicOfferingOutcome {
    /**/
    private org.museframework.bian.classes.FinancialFacility publicOfferingFinancialFacility;

    /**/
    private String publicOfferingWorkProduct;

    public void setPublicOfferingFinancialFacility(org.museframework.bian.classes.FinancialFacility publicOfferingFinancialFacility) {
        this.publicOfferingFinancialFacility = publicOfferingFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getPublicOfferingFinancialFacility() {
        return publicOfferingFinancialFacility;
    }

    public void setPublicOfferingWorkProduct(String publicOfferingWorkProduct) {
        this.publicOfferingWorkProduct = publicOfferingWorkProduct;
    }

    public String getPublicOfferingWorkProduct() {
        return publicOfferingWorkProduct;
    }
}