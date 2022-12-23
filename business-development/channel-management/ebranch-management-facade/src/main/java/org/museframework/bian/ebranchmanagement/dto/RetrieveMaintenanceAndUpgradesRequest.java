package org.museframework.bian.ebranchmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMaintenanceAndUpgradesRequest {
    @MetaField
    private String ebranchmanagementid;

    @MetaField
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