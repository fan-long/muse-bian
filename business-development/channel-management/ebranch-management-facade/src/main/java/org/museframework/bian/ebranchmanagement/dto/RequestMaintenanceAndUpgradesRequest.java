package org.museframework.bian.ebranchmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestMaintenanceAndUpgradesRequest {
    @MetaField
    private String ebranchmanagementid;

    @MetaField
    private String maintenanceandupgradesid;

    @MetaField(ref=true)
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