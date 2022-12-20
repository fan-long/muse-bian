package org.museframework.bian.intpropor.dto;

public class UpdateMaintenanceRequest {
    private String intellectualpropertyportfolioid;

    private String maintenanceid;

    private org.museframework.bian.intpropor.dto.bq.Maintenance maintenance;

    public void setIntellectualpropertyportfolioid(String intellectualpropertyportfolioid) {
        this.intellectualpropertyportfolioid = intellectualpropertyportfolioid;
    }

    public String getIntellectualpropertyportfolioid() {
        return intellectualpropertyportfolioid;
    }

    public void setMaintenanceid(String maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public String getMaintenanceid() {
        return maintenanceid;
    }

    public void setMaintenance(org.museframework.bian.intpropor.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.intpropor.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}