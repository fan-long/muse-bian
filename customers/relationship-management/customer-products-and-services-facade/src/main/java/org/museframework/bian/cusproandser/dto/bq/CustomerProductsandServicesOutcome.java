/*The In-force Product property properties that represent a discrete aspect of the In-force Product property*/
package org.museframework.bian.cusproandser.dto.bq;

public class CustomerProductsandServicesOutcome {
    /**/
    private org.museframework.bian.classes.DirectoryEntry customerProductsandServicesEntry;

    /**/
    private String customerProductsandServicesWorkProduct;

    public void setCustomerProductsandServicesEntry(org.museframework.bian.classes.DirectoryEntry customerProductsandServicesEntry) {
        this.customerProductsandServicesEntry = customerProductsandServicesEntry;
    }

    public org.museframework.bian.classes.DirectoryEntry getCustomerProductsandServicesEntry() {
        return customerProductsandServicesEntry;
    }

    public void setCustomerProductsandServicesWorkProduct(String customerProductsandServicesWorkProduct) {
        this.customerProductsandServicesWorkProduct = customerProductsandServicesWorkProduct;
    }

    public String getCustomerProductsandServicesWorkProduct() {
        return customerProductsandServicesWorkProduct;
    }
}