/*The result of a valuation of some aspect of an Asset. */
package org.museframework.bian.classes;

public class AssetValuation {
    /*A value of some value aspect of an Asset. */
    private String assetValue;

    /*reference to the type of value expressed in the valuation.
this can be ratio, qualifier, amounts, etc.*/
    private String assetValueType;

    /*reference to the type of valuation resulting in the Asset Value*/
    private String assetValuationType;

    /*Valuation date of the collateral (ISO20022)*/
    private String assetValuationDate;

    /*External identifier assigned by an asset valuation service provider to refer to an instance of Asset Valuation */
    private Service assetValuationServiceReference;

    /**/
    private String assetValuationRate;

    /**/
    private String assetValuationStatus;

    /**/
    private String assetValuationValidityPeriod;

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValueType(String assetValueType) {
        this.assetValueType = assetValueType;
    }

    public String getAssetValueType() {
        return assetValueType;
    }

    public void setAssetValuationType(String assetValuationType) {
        this.assetValuationType = assetValuationType;
    }

    public String getAssetValuationType() {
        return assetValuationType;
    }

    public void setAssetValuationDate(String assetValuationDate) {
        this.assetValuationDate = assetValuationDate;
    }

    public String getAssetValuationDate() {
        return assetValuationDate;
    }

    public void setAssetValuationServiceReference(Service assetValuationServiceReference) {
        this.assetValuationServiceReference = assetValuationServiceReference;
    }

    public Service getAssetValuationServiceReference() {
        return assetValuationServiceReference;
    }

    public void setAssetValuationRate(String assetValuationRate) {
        this.assetValuationRate = assetValuationRate;
    }

    public String getAssetValuationRate() {
        return assetValuationRate;
    }

    public void setAssetValuationStatus(String assetValuationStatus) {
        this.assetValuationStatus = assetValuationStatus;
    }

    public String getAssetValuationStatus() {
        return assetValuationStatus;
    }

    public void setAssetValuationValidityPeriod(String assetValuationValidityPeriod) {
        this.assetValuationValidityPeriod = assetValuationValidityPeriod;
    }

    public String getAssetValuationValidityPeriod() {
        return assetValuationValidityPeriod;
    }
}