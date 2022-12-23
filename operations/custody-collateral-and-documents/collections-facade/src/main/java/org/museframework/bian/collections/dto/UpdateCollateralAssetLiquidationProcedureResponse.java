package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCollateralAssetLiquidationProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.collections.dto.cr.CollateralAssetLiquidationProcedure collateralAssetLiquidationProcedure;

    public void setCollateralAssetLiquidationProcedure(org.museframework.bian.collections.dto.cr.CollateralAssetLiquidationProcedure collateralAssetLiquidationProcedure) {
        this.collateralAssetLiquidationProcedure = collateralAssetLiquidationProcedure;
    }

    public org.museframework.bian.collections.dto.cr.CollateralAssetLiquidationProcedure getCollateralAssetLiquidationProcedure() {
        return collateralAssetLiquidationProcedure;
    }
}