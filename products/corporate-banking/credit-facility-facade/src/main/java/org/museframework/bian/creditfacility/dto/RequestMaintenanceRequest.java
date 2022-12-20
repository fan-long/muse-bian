package org.museframework.bian.creditfacility.dto;

public class RequestMaintenanceRequest {
    private String creditfacilityid;

    private String maintenanceid;

    private org.museframework.bian.creditfacility.dto.bq.Maintenance maintenance;

    public void setCreditfacilityid(String creditfacilityid) {
        this.creditfacilityid = creditfacilityid;
    }

    public String getCreditfacilityid() {
        return creditfacilityid;
    }

    public void setMaintenanceid(String maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public String getMaintenanceid() {
        return maintenanceid;
    }

    public void setMaintenance(org.museframework.bian.creditfacility.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.creditfacility.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}