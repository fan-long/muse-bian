/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.colassadm.dto.bq;

public class Valuation {
    /*The type of valuation applied (e.g. mark to market, book value, agency)*/
    private String collateralAssetValuationType;

    /*Reference to 3rd party valuation service provider (e.g. property, art specialist)*/
    private org.museframework.bian.classes.Object collateralAssetValuationServiceReference;

    /*The applied loan to value ratio used in determining collateral value*/
    private String collateralAssetLoantoValueRatio;

    /*The result of a valuation*/
    private String collateralAssetValuation;

    /*The date of a valuation*/
    private String collateralAssetValuationDate;

    public void setCollateralAssetValuationType(String collateralAssetValuationType) {
        this.collateralAssetValuationType = collateralAssetValuationType;
    }

    public String getCollateralAssetValuationType() {
        return collateralAssetValuationType;
    }

    public void setCollateralAssetValuationServiceReference(org.museframework.bian.classes.Object collateralAssetValuationServiceReference) {
        this.collateralAssetValuationServiceReference = collateralAssetValuationServiceReference;
    }

    public org.museframework.bian.classes.Object getCollateralAssetValuationServiceReference() {
        return collateralAssetValuationServiceReference;
    }

    public void setCollateralAssetLoantoValueRatio(String collateralAssetLoantoValueRatio) {
        this.collateralAssetLoantoValueRatio = collateralAssetLoantoValueRatio;
    }

    public String getCollateralAssetLoantoValueRatio() {
        return collateralAssetLoantoValueRatio;
    }

    public void setCollateralAssetValuation(String collateralAssetValuation) {
        this.collateralAssetValuation = collateralAssetValuation;
    }

    public String getCollateralAssetValuation() {
        return collateralAssetValuation;
    }

    public void setCollateralAssetValuationDate(String collateralAssetValuationDate) {
        this.collateralAssetValuationDate = collateralAssetValuationDate;
    }

    public String getCollateralAssetValuationDate() {
        return collateralAssetValuationDate;
    }
}