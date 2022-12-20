/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

public class Collateral {
    /*The required collateral amount for the offer*/
    private String collateralRequirement;

    /*Reference to earmarked collateral during the offer procedure*/
    private org.museframework.bian.classes.Object collateralEarmarkReference;

    /*Reference to the related collateral asset (e.g. property)*/
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