package org.museframework.bian.mortgageloan.dto;

public class RequestCollateralRequest {
    private String mortgageloanid;

    private String collateralid;

    private org.museframework.bian.mortgageloan.dto.bq.Collateral collateral;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setCollateralid(String collateralid) {
        this.collateralid = collateralid;
    }

    public String getCollateralid() {
        return collateralid;
    }

    public void setCollateral(org.museframework.bian.mortgageloan.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}