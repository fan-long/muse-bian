package org.museframework.bian.advvoiserman.dto;

public class UpdateMaintenanceAndUpgradesRequest {
    private String advancedvoiceservicesmanagementid;

    private String maintenanceandupgradesid;

    private org.museframework.bian.advvoiserman.dto.bq.MaintenanceAndUpgrades maintenanceAndUpgrades;

    public void setAdvancedvoiceservicesmanagementid(String advancedvoiceservicesmanagementid) {
        this.advancedvoiceservicesmanagementid = advancedvoiceservicesmanagementid;
    }

    public String getAdvancedvoiceservicesmanagementid() {
        return advancedvoiceservicesmanagementid;
    }

    public void setMaintenanceandupgradesid(String maintenanceandupgradesid) {
        this.maintenanceandupgradesid = maintenanceandupgradesid;
    }

    public String getMaintenanceandupgradesid() {
        return maintenanceandupgradesid;
    }

    public void setMaintenanceAndUpgrades(org.museframework.bian.advvoiserman.dto.bq.MaintenanceAndUpgrades maintenanceAndUpgrades) {
        this.maintenanceAndUpgrades = maintenanceAndUpgrades;
    }

    public org.museframework.bian.advvoiserman.dto.bq.MaintenanceAndUpgrades getMaintenanceAndUpgrades() {
        return maintenanceAndUpgrades;
    }
}