/*A Fee Modality applicable to a Fee Product Feature
*/
package org.museframework.bian.classes;

public class FeeProductFeatureModality {
    /*Formula (calculation rule) can be used to calculate a charge/fee.*/
    private String feeCalculationMethod;

    /*The way in which a fee or charge can be paid. 
*/
    private String feePaymentMethod;

    /*Frequency at which the fee is charged*/
    private String chargingFrequency;

    public void setFeeCalculationMethod(String feeCalculationMethod) {
        this.feeCalculationMethod = feeCalculationMethod;
    }

    public String getFeeCalculationMethod() {
        return feeCalculationMethod;
    }

    public void setFeePaymentMethod(String feePaymentMethod) {
        this.feePaymentMethod = feePaymentMethod;
    }

    public String getFeePaymentMethod() {
        return feePaymentMethod;
    }

    public void setChargingFrequency(String chargingFrequency) {
        this.chargingFrequency = chargingFrequency;
    }

    public String getChargingFrequency() {
        return chargingFrequency;
    }
}