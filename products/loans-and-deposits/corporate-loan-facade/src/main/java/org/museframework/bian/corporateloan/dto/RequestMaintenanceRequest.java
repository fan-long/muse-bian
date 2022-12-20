package org.museframework.bian.corporateloan.dto;

public class RequestMaintenanceRequest {
    private String corporateloanid;

    private String maintenanceid;

    private org.museframework.bian.corporateloan.dto.bq.Maintenance maintenance;

    public void setCorporateloanid(String corporateloanid) {
        this.corporateloanid = corporateloanid;
    }

    public String getCorporateloanid() {
        return corporateloanid;
    }

    public void setMaintenanceid(String maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public String getMaintenanceid() {
        return maintenanceid;
    }

    public void setMaintenance(org.museframework.bian.corporateloan.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.corporateloan.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}