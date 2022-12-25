/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.productdirectory.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Production {
    /*List and description of locations where the product or service is supported*/
    @MetaField(0)
    private String productandServiceLocationAvailability;

    /*The schedule for when the product or service can be accessed*/
    @MetaField(0)
    private String productandServiceTimeAvailability;

    /*The access channels and devices that are supported by the product or service*/
    @MetaField(0)
    private String productandServiceAccessAvailability;

    public void setProductandServiceLocationAvailability(String productandServiceLocationAvailability) {
        this.productandServiceLocationAvailability = productandServiceLocationAvailability;
    }

    public String getProductandServiceLocationAvailability() {
        return productandServiceLocationAvailability;
    }

    public void setProductandServiceTimeAvailability(String productandServiceTimeAvailability) {
        this.productandServiceTimeAvailability = productandServiceTimeAvailability;
    }

    public String getProductandServiceTimeAvailability() {
        return productandServiceTimeAvailability;
    }

    public void setProductandServiceAccessAvailability(String productandServiceAccessAvailability) {
        this.productandServiceAccessAvailability = productandServiceAccessAvailability;
    }

    public String getProductandServiceAccessAvailability() {
        return productandServiceAccessAvailability;
    }
}