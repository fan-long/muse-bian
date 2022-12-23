package org.museframework.bian.corporateloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteServiceFeesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporateloan.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.corporateloan.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.corporateloan.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}