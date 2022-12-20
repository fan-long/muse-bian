/*Asset provided by a debtor as security for a payment or repayment of an obligation.


Financial collateral is an asset provided by a borrower to a lender.

The term collateral refers to an asset that a lender accepts as security for a loan. https://www.investopedia.com/terms/c/collateral.asp*/
package org.museframework.bian.classes;

public class CollateralAsset {
    /**/
    private String collateralItemIdentifier;

    /**/
    private String collateralItemType;

    /**/
    private String collateralItemValuation;

    public void setCollateralItemIdentifier(String collateralItemIdentifier) {
        this.collateralItemIdentifier = collateralItemIdentifier;
    }

    public String getCollateralItemIdentifier() {
        return collateralItemIdentifier;
    }

    public void setCollateralItemType(String collateralItemType) {
        this.collateralItemType = collateralItemType;
    }

    public String getCollateralItemType() {
        return collateralItemType;
    }

    public void setCollateralItemValuation(String collateralItemValuation) {
        this.collateralItemValuation = collateralItemValuation;
    }

    public String getCollateralItemValuation() {
        return collateralItemValuation;
    }
}