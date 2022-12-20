package org.museframework.bian.colassadm.dto;

public class RequestMaintenanceRequest {
    private String collateralassetadministrationid;

    private String maintenanceid;

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