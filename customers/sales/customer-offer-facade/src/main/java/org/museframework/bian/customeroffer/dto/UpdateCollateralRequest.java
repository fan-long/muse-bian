package org.museframework.bian.customeroffer.dto;

public class UpdateCollateralRequest {
    private String customerofferid;

    private String collateralid;

    private org.museframework.bian.customeroffer.dto.bq.Collateral collateral;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setCollateralid(String collateralid) {
        this.collateralid = collateralid;
    }

    public String getCollateralid() {
        return collateralid;
    }

    public void setCollateral(org.museframework.bian.customeroffer.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.customeroffer.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}