/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

public class Booking {
    /*Defines the booking entity*/
    private org.museframework.bian.classes.Object businessUnitReference;

    /*Defines the booking rules (e.g. booking  value ratios)*/
    private String assetLiabilityType;

    /*The principle amount for booking*/
    private String amount;

    public void setBusinessUnitReference(org.museframework.bian.classes.Object businessUnitReference) {
        this.businessUnitReference = businessUnitReference;
    }

    public org.museframework.bian.classes.Object getBusinessUnitReference() {
        return businessUnitReference;
    }

    public void setAssetLiabilityType(String assetLiabilityType) {
        this.assetLiabilityType = assetLiabilityType;
    }

    public String getAssetLiabilityType() {
        return assetLiabilityType;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }
}