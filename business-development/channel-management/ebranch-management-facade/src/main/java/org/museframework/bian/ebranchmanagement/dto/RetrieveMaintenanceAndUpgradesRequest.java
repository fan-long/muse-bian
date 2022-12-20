package org.museframework.bian.ebranchmanagement.dto;

public class RetrieveMaintenanceAndUpgradesRequest {
    private String ebranchmanagementid;

    private String maintenanceandupgradesid;

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
}