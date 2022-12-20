package org.museframework.bian.loan.dto;

public class RequestMaintenanceResponse {
    private org.museframework.bian.loan.dto.bq.Maintenance maintenance;

    public void setMaintenance(org.museframework.bian.loan.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.loan.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}