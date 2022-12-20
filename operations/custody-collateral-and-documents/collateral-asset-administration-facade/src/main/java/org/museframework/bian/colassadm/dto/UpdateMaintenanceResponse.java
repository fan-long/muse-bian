package org.museframework.bian.colassadm.dto;

public class UpdateMaintenanceResponse {
    private org.museframework.bian.colassadm.dto.bq.Maintenance maintenance;

    public void setMaintenance(org.museframework.bian.colassadm.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.colassadm.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}