package org.museframework.bian.colassadm.dto;

public class CreateMaintenanceResponse {
    private org.museframework.bian.colassadm.dto.bq.Maintenance maintenance;

    public void setMaintenance(org.museframework.bian.colassadm.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.colassadm.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}