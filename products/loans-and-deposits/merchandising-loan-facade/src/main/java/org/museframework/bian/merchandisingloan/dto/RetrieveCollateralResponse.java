package org.museframework.bian.merchandisingloan.dto;

public class RetrieveCollateralResponse {
    private org.museframework.bian.merchandisingloan.dto.bq.Collateral collateral;

    public void setCollateral(org.museframework.bian.merchandisingloan.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}