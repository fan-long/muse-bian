package org.museframework.bian.collections.dto;

public class ControlCollateralAssetLiquidationProcedureRequest {
    private String collectionsid;

    private org.museframework.bian.collections.dto.cr.CollateralAssetLiquidationProcedure collateralAssetLiquidationProcedure;

    public void setCollectionsid(String collectionsid) {
        this.collectionsid = collectionsid;
    }

    public String getCollectionsid() {
        return collectionsid;
    }

    public void setCollateralAssetLiquidationProcedure(org.museframework.bian.collections.dto.cr.CollateralAssetLiquidationProcedure collateralAssetLiquidationProcedure) {
        this.collateralAssetLiquidationProcedure = collateralAssetLiquidationProcedure;
    }

    public org.museframework.bian.collections.dto.cr.CollateralAssetLiquidationProcedure getCollateralAssetLiquidationProcedure() {
        return collateralAssetLiquidationProcedure;
    }
}