/*Capture and maintain reference information about some type of entitity  within Special Pricing Conditions.*/
package org.museframework.bian.spepricon.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SpecialPricingConditionsOutcome {
    /**/
    @MetaField
    private String specialPricingConditionsEntry;

    /**/
    @MetaField
    private String specialPricingConditionsWorkProduct;

    public void setSpecialPricingConditionsEntry(String specialPricingConditionsEntry) {
        this.specialPricingConditionsEntry = specialPricingConditionsEntry;
    }

    public String getSpecialPricingConditionsEntry() {
        return specialPricingConditionsEntry;
    }

    public void setSpecialPricingConditionsWorkProduct(String specialPricingConditionsWorkProduct) {
        this.specialPricingConditionsWorkProduct = specialPricingConditionsWorkProduct;
    }

    public String getSpecialPricingConditionsWorkProduct() {
        return specialPricingConditionsWorkProduct;
    }
}