package org.museframework.bian.corporateloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestMaintenanceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporateloan.dto.bq.Maintenance maintenance;

    public void setMaintenance(org.museframework.bian.corporateloan.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.corporateloan.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}