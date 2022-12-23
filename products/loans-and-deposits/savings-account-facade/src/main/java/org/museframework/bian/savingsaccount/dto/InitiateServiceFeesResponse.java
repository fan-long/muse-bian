package org.museframework.bian.savingsaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateServiceFeesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.savingsaccount.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.savingsaccount.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.savingsaccount.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}