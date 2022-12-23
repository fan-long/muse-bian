package org.museframework.bian.colassadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CreateMaintenanceRequest {
    @MetaField
    private String collateralassetadministrationid;

    @MetaField
    private String maintenanceid;

    @MetaField(ref=true)
    private org.museframework.bian.colassadm.dto.bq.Maintenance maintenance;

    public void setCollateralassetadministrationid(String collateralassetadministrationid) {
        this.collateralassetadministrationid = collateralassetadministrationid;
    }

    public String getCollateralassetadministrationid() {
        return collateralassetadministrationid;
    }

    public void setMaintenanceid(String maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public String getMaintenanceid() {
        return maintenanceid;
    }

    public void setMaintenance(org.museframework.bian.colassadm.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.colassadm.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}