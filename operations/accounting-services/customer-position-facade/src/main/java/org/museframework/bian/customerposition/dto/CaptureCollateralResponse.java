package org.museframework.bian.customerposition.dto;

public class CaptureCollateralResponse {
    private org.museframework.bian.customerposition.dto.bq.Collateral collateral;

    public void setCollateral(org.museframework.bian.customerposition.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.customerposition.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}