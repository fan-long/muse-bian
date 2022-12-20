package org.museframework.bian.consumerloan.dto;

public class RetrieveMaintenanceResponse {
    private org.museframework.bian.consumerloan.dto.bq.Maintenance maintenance;

    public void setMaintenance(org.museframework.bian.consumerloan.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.consumerloan.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}