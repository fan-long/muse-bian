package org.museframework.bian.advvoiserman.dto;

public class UpdateMaintenanceAndUpgradesResponse {
    private org.museframework.bian.advvoiserman.dto.bq.MaintenanceAndUpgrades maintenanceAndUpgrades;

    public void setMaintenanceAndUpgrades(org.museframework.bian.advvoiserman.dto.bq.MaintenanceAndUpgrades maintenanceAndUpgrades) {
        this.maintenanceAndUpgrades = maintenanceAndUpgrades;
    }

    public org.museframework.bian.advvoiserman.dto.bq.MaintenanceAndUpgrades getMaintenanceAndUpgrades() {
        return maintenanceAndUpgrades;
    }
}