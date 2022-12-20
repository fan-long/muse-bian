/*The configuration and execution of Trust Estate, Inheritance and Income Tax Fulfillment arrangement within the Trust Estate, Inheritance and Income Tax Fulfillment*/
package org.museframework.bian.trustservices.dto.bq;

public class TrustServicesOutcome {
    /**/
    private org.museframework.bian.classes.FinancialFacility trustServicesFinancialFacility;

    /**/
    private String trustServicesWorkProduct;

    public void setTrustServicesFinancialFacility(org.museframework.bian.classes.FinancialFacility trustServicesFinancialFacility) {
        this.trustServicesFinancialFacility = trustServicesFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getTrustServicesFinancialFacility() {
        return trustServicesFinancialFacility;
    }

    public void setTrustServicesWorkProduct(String trustServicesWorkProduct) {
        this.trustServicesWorkProduct = trustServicesWorkProduct;
    }

    public String getTrustServicesWorkProduct() {
        return trustServicesWorkProduct;
    }
}