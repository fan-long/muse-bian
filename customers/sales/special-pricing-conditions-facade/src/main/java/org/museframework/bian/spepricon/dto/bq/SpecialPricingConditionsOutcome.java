/*Capture and maintain reference information about some type of entitity  within Special Pricing Conditions.*/
package org.museframework.bian.spepricon.dto.bq;

public class SpecialPricingConditionsOutcome {
    /**/
    private String specialPricingConditionsEntry;

    /**/
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