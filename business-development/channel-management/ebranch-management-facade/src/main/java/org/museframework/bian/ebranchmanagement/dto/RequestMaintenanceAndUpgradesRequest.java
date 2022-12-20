package org.museframework.bian.ebranchmanagement.dto;

public class RequestMaintenanceAndUpgradesRequest {
    private String ebranchmanagementid;

    private String maintenanceandupgradesid;

    private org.museframework.bian.ebranchmanagement.dto.bq.MaintenanceAndUpgrades maintenanceAndUpgrades;

    public void setEbranchmanagementid(String ebranchmanagementid) {
        this.ebranchmanagementid = ebranchmanagementid;
    }

    public String getEbranchmanagementid() {
        return ebranchmanagementid;
    }

    public void setMaintenanceandupgradesid(String maintenanceandupgradesid) {
        this.maintenanceandupgradesid = maintenanceandupgradesid;
    }

    public String getMaintenanceandupgradesid() {
        return maintenanceandupgradesid;
    }

    public void setMaintenanceAndUpgrades(org.museframework.bian.ebranchmanagement.dto.bq.MaintenanceAndUpgrades maintenanceAndUpgrades) {
        this.maintenanceAndUpgrades = maintenanceAndUpgrades;
    }

    public org.museframework.bian.ebranchmanagement.dto.bq.MaintenanceAndUpgrades getMaintenanceAndUpgrades() {
        return maintenanceAndUpgrades;
    }
}