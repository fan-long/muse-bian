package org.museframework.bian.advvoiserman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CreateMaintenanceAndUpgradesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.advvoiserman.dto.bq.MaintenanceAndUpgrades maintenanceAndUpgrades;

    public void setMaintenanceAndUpgrades(org.museframework.bian.advvoiserman.dto.bq.MaintenanceAndUpgrades maintenanceAndUpgrades) {
        this.maintenanceAndUpgrades = maintenanceAndUpgrades;
    }

    public org.museframework.bian.advvoiserman.dto.bq.MaintenanceAndUpgrades getMaintenanceAndUpgrades() {
        return maintenanceAndUpgrades;
    }
}