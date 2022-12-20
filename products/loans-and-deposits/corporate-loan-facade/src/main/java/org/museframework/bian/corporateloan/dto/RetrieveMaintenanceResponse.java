package org.museframework.bian.corporateloan.dto;

public class RetrieveMaintenanceResponse {
    private org.museframework.bian.corporateloan.dto.bq.Maintenance maintenance;

    public void setMaintenance(org.museframework.bian.corporateloan.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.corporateloan.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}