/**/
package org.museframework.bian.classes;

public class PricingTransaction {
    /**/
    private String pricingTransactionAppliedRateAmount;

    /**/
    private String pricingTransactionAccuredRateAmount;

    public void setPricingTransactionAppliedRateAmount(String pricingTransactionAppliedRateAmount) {
        this.pricingTransactionAppliedRateAmount = pricingTransactionAppliedRateAmount;
    }

    public String getPricingTransactionAppliedRateAmount() {
        return pricingTransactionAppliedRateAmount;
    }

    public void setPricingTransactionAccuredRateAmount(String pricingTransactionAccuredRateAmount) {
        this.pricingTransactionAccuredRateAmount = pricingTransactionAccuredRateAmount;
    }

    public String getPricingTransactionAccuredRateAmount() {
        return pricingTransactionAccuredRateAmount;
    }
}