/*A selection of Fee Product Feature modalities for a specific fee arrangement in a specific agreement*/
package org.museframework.bian.classes;

public class FeeArrangementModality {
    /*Formula (calculation rule) used to calculate a charge/fee.*/
    private String feeCalculationMethod;

    /*Specifies how charges are paid. (ISO20022)*/
    private String feePaymentMethod;

    /*Frequency at which the fee is charged*/
    private String chargingFrequency;

    /**/
    private org.museframework.bian.enumerations.Modalitytypevalues feeModalityType;

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

    public void setFeeModalityType(org.museframework.bian.enumerations.Modalitytypevalues feeModalityType) {
        this.feeModalityType = feeModalityType;
    }

    public org.museframework.bian.enumerations.Modalitytypevalues getFeeModalityType() {
        return feeModalityType;
    }
}