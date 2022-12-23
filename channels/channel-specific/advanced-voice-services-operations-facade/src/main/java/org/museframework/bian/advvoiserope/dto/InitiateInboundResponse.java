package org.museframework.bian.advvoiserope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateInboundResponse {
    @MetaField(ref=true)
    private org.museframework.bian.advvoiserope.dto.bq.Inbound inbound;

    public void setInbound(org.museframework.bian.advvoiserope.dto.bq.Inbound inbound) {
        this.inbound = inbound;
    }

    public org.museframework.bian.advvoiserope.dto.bq.Inbound getInbound() {
        return inbound;
    }
}