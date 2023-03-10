/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Booking {
    /*Defines the booking entity*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object businessUnitReference;

    /*Defines the booking rules (e.g. booking  value ratios)*/
    @MetaField(0)
    private String assetLiabilityType;

    /*The principle amount for booking*/
    @MetaField(0)
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