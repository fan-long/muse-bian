package org.museframework.bian.ebranchmanagement.dto;

public class UpdateMaintenanceAndUpgradesResponse {
    private org.museframework.bian.ebranchmanagement.dto.bq.MaintenanceAndUpgrades maintenanceAndUpgrades;

    public void setMaintenanceAndUpgrades(org.museframework.bian.ebranchmanagement.dto.bq.MaintenanceAndUpgrades maintenanceAndUpgrades) {
        this.maintenanceAndUpgrades = maintenanceAndUpgrades;
    }

    public org.museframework.bian.ebranchmanagement.dto.bq.MaintenanceAndUpgrades getMaintenanceAndUpgrades() {
        return maintenanceAndUpgrades;
    }
}