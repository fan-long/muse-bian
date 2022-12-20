package org.museframework.bian.leasing.dto;

public class RequestCollateralResponse {
    private org.museframework.bian.leasing.dto.bq.Collateral collateral;

    public void setCollateral(org.museframework.bian.leasing.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.leasing.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}