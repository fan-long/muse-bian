package org.museframework.bian.virtualaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateServiceFeesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.virtualaccount.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.virtualaccount.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.virtualaccount.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}