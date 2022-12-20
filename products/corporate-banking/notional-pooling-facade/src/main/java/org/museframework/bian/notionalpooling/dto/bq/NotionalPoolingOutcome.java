/*The configuration and execution of Notional Account Interest Allocation Fulfillment arrangement within the Notional Account Interest Allocation Fulfillment*/
package org.museframework.bian.notionalpooling.dto.bq;

public class NotionalPoolingOutcome {
    /**/
    private org.museframework.bian.classes.FinancialFacility notionalPoolingFinancialFacility;

    /**/
    private String notionalPoolingWorkProduct;

    public void setNotionalPoolingFinancialFacility(org.museframework.bian.classes.FinancialFacility notionalPoolingFinancialFacility) {
        this.notionalPoolingFinancialFacility = notionalPoolingFinancialFacility;
    }

    public org.museframework.bian.classes.FinancialFacility getNotionalPoolingFinancialFacility() {
        return notionalPoolingFinancialFacility;
    }

    public void setNotionalPoolingWorkProduct(String notionalPoolingWorkProduct) {
        this.notionalPoolingWorkProduct = notionalPoolingWorkProduct;
    }

    public String getNotionalPoolingWorkProduct() {
        return notionalPoolingWorkProduct;
    }
}