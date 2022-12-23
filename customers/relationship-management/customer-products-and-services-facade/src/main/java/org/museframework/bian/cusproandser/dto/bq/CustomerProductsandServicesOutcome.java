/*The In-force Product property properties that represent a discrete aspect of the In-force Product property*/
package org.museframework.bian.cusproandser.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerProductsandServicesOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry customerProductsandServicesEntry;

    /**/
    @MetaField
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