/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Product Combination. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.productcombination.dto.bq;

public class ProductCombinationOutcome {
    /**/
    private String productCombinationFinancialFacility;

    /**/
    private String productCombinationWorkProduct;

    public void setProductCombinationFinancialFacility(String productCombinationFinancialFacility) {
        this.productCombinationFinancialFacility = productCombinationFinancialFacility;
    }

    public String getProductCombinationFinancialFacility() {
        return productCombinationFinancialFacility;
    }

    public void setProductCombinationWorkProduct(String productCombinationWorkProduct) {
        this.productCombinationWorkProduct = productCombinationWorkProduct;
    }

    public String getProductCombinationWorkProduct() {
        return productCombinationWorkProduct;
    }
}