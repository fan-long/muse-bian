/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Collateral {
    /*The required collateral amount for the offer*/
    @MetaField
    private String collateralRequirement;

    /*Reference to earmarked collateral during the offer procedure*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralEarmarkReference;

    /*Reference to the related collateral asset (e.g. property)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralAssetReference;

    public void setCollateralRequirement(String collateralRequirement) {
        this.collateralRequirement = collateralRequirement;
    }

    public String getCollateralRequirement() {
        return collateralRequirement;
    }

    public void setCollateralEarmarkReference(org.museframework.bian.classes.Object collateralEarmarkReference) {
        this.collateralEarmarkReference = collateralEarmarkReference;
    }

    public org.museframework.bian.classes.Object getCollateralEarmarkReference() {
        return collateralEarmarkReference;
    }

    public void setCollateralAssetReference(org.museframework.bian.classes.Object collateralAssetReference) {
        this.collateralAssetReference = collateralAssetReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetReference() {
        return collateralAssetReference;
    }
}