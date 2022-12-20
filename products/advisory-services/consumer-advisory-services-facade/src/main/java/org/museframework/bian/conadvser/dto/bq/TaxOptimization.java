/*The product features/services available with a financical facility*/
package org.museframework.bian.conadvser.dto.bq;

public class TaxOptimization {
    /*Reference to the consumer tax advisory service (used to access guidance materials)*/
    private org.museframework.bian.classes.Object productandServiceReference;

    /*Summary recommendations arising from the advice that is added to the consolidated record*/
    private String taxOptimizationAdviceResult;

    public void setProductandServiceReference(org.museframework.bian.classes.Object productandServiceReference) {
        this.productandServiceReference = productandServiceReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceReference() {
        return productandServiceReference;
    }

    public void setTaxOptimizationAdviceResult(String taxOptimizationAdviceResult) {
        this.taxOptimizationAdviceResult = taxOptimizationAdviceResult;
    }

    public String getTaxOptimizationAdviceResult() {
        return taxOptimizationAdviceResult;
    }
}