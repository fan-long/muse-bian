package org.museframework.bian.creditfacility.dto;

public class RetrieveMaintenanceResponse {
    private org.museframework.bian.creditfacility.dto.bq.Maintenance maintenance;

    public void setMaintenance(org.museframework.bian.creditfacility.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.creditfacility.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}