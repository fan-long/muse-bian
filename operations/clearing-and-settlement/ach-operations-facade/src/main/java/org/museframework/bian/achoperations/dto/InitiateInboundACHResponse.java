package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateInboundACHResponse {
    @MetaField(ref=true)
    private org.museframework.bian.achoperations.dto.bq.InboundACH inboundACH;

    public void setInboundACH(org.museframework.bian.achoperations.dto.bq.InboundACH inboundACH) {
        this.inboundACH = inboundACH;
    }

    public org.museframework.bian.achoperations.dto.bq.InboundACH getInboundACH() {
        return inboundACH;
    }
}