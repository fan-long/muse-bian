package org.museframework.bian.customeroffer.dto;

public class RetrieveCollateralResponse {
    private org.museframework.bian.customeroffer.dto.bq.Collateral collateral;

    public void setCollateral(org.museframework.bian.customeroffer.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.customeroffer.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}