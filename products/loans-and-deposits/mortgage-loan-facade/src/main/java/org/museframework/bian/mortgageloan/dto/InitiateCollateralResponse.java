package org.museframework.bian.mortgageloan.dto;

public class InitiateCollateralResponse {
    private org.museframework.bian.mortgageloan.dto.bq.Collateral collateral;

    public void setCollateral(org.museframework.bian.mortgageloan.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}