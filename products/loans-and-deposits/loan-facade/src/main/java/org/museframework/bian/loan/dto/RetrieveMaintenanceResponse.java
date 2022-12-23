package org.museframework.bian.loan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMaintenanceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.loan.dto.bq.Maintenance maintenance;

    public void setMaintenance(org.museframework.bian.loan.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.loan.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}