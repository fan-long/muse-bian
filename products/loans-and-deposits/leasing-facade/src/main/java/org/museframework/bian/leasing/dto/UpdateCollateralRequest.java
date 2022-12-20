package org.museframework.bian.leasing.dto;

public class UpdateCollateralRequest {
    private String leasingid;

    private String collateralid;

    private org.museframework.bian.leasing.dto.bq.Collateral collateral;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setCollateralid(String collateralid) {
        this.collateralid = collateralid;
    }

    public String getCollateralid() {
        return collateralid;
    }

    public void setCollateral(org.museframework.bian.leasing.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.leasing.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}