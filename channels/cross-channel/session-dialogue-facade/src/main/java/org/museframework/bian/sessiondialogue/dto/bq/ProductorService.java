/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.sessiondialogue.dto.bq;

public class ProductorService {
    /*Reference to a specific product instance provided by the customer*/
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The result of the invoked product or service fulfillment service domain (e.g. balance provided, payment initiated, reference details updated)*/
    private String productandServiceTaskResult;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setProductandServiceTaskResult(String productandServiceTaskResult) {
        this.productandServiceTaskResult = productandServiceTaskResult;
    }

    public String getProductandServiceTaskResult() {
        return productandServiceTaskResult;
    }
}