package org.museframework.bian.colassadm.dto;

public class UpdateCollateralAssetAdministrativePlanRequest {
    private String collateralassetadministrationid;

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