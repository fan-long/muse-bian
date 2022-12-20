package org.museframework.bian.collections.dto;

public class UpdateCollateralLiquidationRequest {
    private String collectionsid;

    private String collateralliquidationid;

    private org.museframework.bian.collections.dto.bq.CollateralLiquidation collateralLiquidation;

    public void setCollectionsid(String collectionsid) {
        this.collectionsid = collectionsid;
    }

    public String getCollectionsid() {
        return collectionsid;
    }

    public void setCollateralliquidationid(String collateralliquidationid) {
        this.collateralliquidationid = collateralliquidationid;
    }

    public String getCollateralliquidationid() {
        return collateralliquidationid;
    }

    public void setCollateralLiquidation(org.museframework.bian.collections.dto.bq.CollateralLiquidation collateralLiquidation) {
        this.collateralLiquidation = collateralLiquidation;
    }

    public org.museframework.bian.collections.dto.bq.CollateralLiquidation getCollateralLiquidation() {
        return collateralLiquidation;
    }
}