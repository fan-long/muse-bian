package org.museframework.bian.ebranchmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CreateMaintenanceAndUpgradesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.ebranchmanagement.dto.bq.MaintenanceAndUpgrades maintenanceAndUpgrades;

    public void setMaintenanceAndUpgrades(org.museframework.bian.ebranchmanagement.dto.bq.MaintenanceAndUpgrades maintenanceAndUpgrades) {
        this.maintenanceAndUpgrades = maintenanceAndUpgrades;
    }

    public org.museframework.bian.ebranchmanagement.dto.bq.MaintenanceAndUpgrades getMaintenanceAndUpgrades() {
        return maintenanceAndUpgrades;
    }
}