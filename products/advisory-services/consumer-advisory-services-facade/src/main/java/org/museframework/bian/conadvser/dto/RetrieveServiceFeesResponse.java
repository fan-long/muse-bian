package org.museframework.bian.conadvser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveServiceFeesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.conadvser.dto.bq.ServiceFees serviceFees;

    public void setServiceFees(org.museframework.bian.conadvser.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.conadvser.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}