package org.museframework.bian.intpropor.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateMaintenanceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.intpropor.dto.bq.Maintenance maintenance;

    public void setMaintenance(org.museframework.bian.intpropor.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.intpropor.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}