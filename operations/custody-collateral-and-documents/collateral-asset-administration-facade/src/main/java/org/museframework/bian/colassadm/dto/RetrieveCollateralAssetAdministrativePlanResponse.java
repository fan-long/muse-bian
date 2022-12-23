package org.museframework.bian.colassadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCollateralAssetAdministrativePlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.colassadm.dto.cr.CollateralAssetAdministrativePlan collateralAssetAdministrativePlan;

    public void setCollateralAssetAdministrativePlan(org.museframework.bian.colassadm.dto.cr.CollateralAssetAdministrativePlan collateralAssetAdministrativePlan) {
        this.collateralAssetAdministrativePlan = collateralAssetAdministrativePlan;
    }

    public org.museframework.bian.colassadm.dto.cr.CollateralAssetAdministrativePlan getCollateralAssetAdministrativePlan() {
        return collateralAssetAdministrativePlan;
    }
}