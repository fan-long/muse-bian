package org.museframework.bian.intpropor.dto;

public class UpdateMaintenanceResponse {
    private org.museframework.bian.intpropor.dto.bq.Maintenance maintenance;

    public void setMaintenance(org.museframework.bian.intpropor.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.intpropor.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}