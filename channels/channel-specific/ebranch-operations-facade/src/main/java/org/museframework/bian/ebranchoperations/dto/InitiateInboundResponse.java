package org.museframework.bian.ebranchoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateInboundResponse {
    @MetaField(ref=true)
    private org.museframework.bian.ebranchoperations.dto.bq.Inbound inbound;

    public void setInbound(org.museframework.bian.ebranchoperations.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.ebranchoperations.dto.bq.Inbound getInbound() {
        return inbound;
    }
}