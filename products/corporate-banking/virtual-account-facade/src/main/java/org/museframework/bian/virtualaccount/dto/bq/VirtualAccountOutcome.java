/*The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment*/
package org.museframework.bian.virtualaccount.dto.bq;

public class VirtualAccountOutcome {
    /**/
    private String virtualAccountFinancialFacility;

    /**/
    private String virtualAccountWorkProduct;

    public void setVirtualAccountFinancialFacility(String virtualAccountFinancialFacility) {
        this.virtualAccountFinancialFacility = virtualAccountFinancialFacility;
    }

    public String getVirtualAccountFinancialFacility() {
        return virtualAccountFinancialFacility;
    }

    public void setVirtualAccountWorkProduct(String virtualAccountWorkProduct) {
        this.virtualAccountWorkProduct = virtualAccountWorkProduct;
    }

    public String getVirtualAccountWorkProduct() {
        return virtualAccountWorkProduct;
    }
}