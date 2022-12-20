package org.museframework.bian.consumerloan.dto;

public class RequestMaintenanceRequest {
    private String consumerloanid;

    private String maintenanceid;

    private org.museframework.bian.consumerloan.dto.bq.Maintenance maintenance;

    public void setConsumerloanid(String consumerloanid) {
        this.consumerloanid = consumerloanid;
    }

    public String getConsumerloanid() {
        return consumerloanid;
    }

    public void setMaintenanceid(String maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public String getMaintenanceid() {
        return maintenanceid;
    }

    public void setMaintenance(org.museframework.bian.consumerloan.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.consumerloan.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}