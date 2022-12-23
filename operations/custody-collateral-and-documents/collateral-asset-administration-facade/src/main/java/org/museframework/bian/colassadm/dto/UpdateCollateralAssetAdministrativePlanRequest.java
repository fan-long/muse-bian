package org.museframework.bian.colassadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCollateralAssetAdministrativePlanRequest {
    @MetaField
    private String collateralassetadministrationid;

    @MetaField(ref=true)
    private org.museframework.bian.colassadm.dto.cr.CollateralAssetAdministrativePlan collateralAssetAdministrativePlan;

    public void setCollateralassetadministrationid(String collateralassetadministrationid) {
        this.collateralassetadministrationid = collateralassetadministrationid;
    }

    public String getCollateralassetadministrationid() {
        return collateralassetadministrationid;
    }

    public void setCollateralAssetAdministrativePlan(org.museframework.bian.colassadm.dto.cr.CollateralAssetAdministrativePlan collateralAssetAdministrativePlan) {
        this.collateralAssetAdministrativePlan = collateralAssetAdministrativePlan;
    }

    public org.museframework.bian.colassadm.dto.cr.CollateralAssetAdministrativePlan getCollateralAssetAdministrativePlan() {
        return collateralAssetAdministrativePlan;
    }
}