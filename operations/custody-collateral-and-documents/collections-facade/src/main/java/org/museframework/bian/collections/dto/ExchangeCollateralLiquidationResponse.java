package org.museframework.bian.collections.dto;

public class ExchangeCollateralLiquidationResponse {
    private org.museframework.bian.collections.dto.bq.CollateralLiquidation collateralLiquidation;

    public void setCollateralLiquidation(org.museframework.bian.collections.dto.bq.CollateralLiquidation collateralLiquidation) {
        this.collateralLiquidation = collateralLiquidation;
    }

    public org.museframework.bian.collections.dto.bq.CollateralLiquidation getCollateralLiquidation() {
        return collateralLiquidation;
    }
}