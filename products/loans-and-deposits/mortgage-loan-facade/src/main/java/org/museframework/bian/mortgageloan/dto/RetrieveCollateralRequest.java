package org.museframework.bian.mortgageloan.dto;

public class RetrieveCollateralRequest {
    private String mortgageloanid;

    private String collateralid;

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
}