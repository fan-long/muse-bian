/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

public class ProductInitialization {
    /*Reference to a specific product instance if the offer is accepted and the product set-up initiated*/
    private org.museframework.bian.classes.Object productInstanceReference;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }
}