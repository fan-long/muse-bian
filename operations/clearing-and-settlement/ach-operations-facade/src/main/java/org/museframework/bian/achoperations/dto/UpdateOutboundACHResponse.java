package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateOutboundACHResponse {
    @MetaField(ref=true)
    private org.museframework.bian.achoperations.dto.bq.OutboundACH outboundACH;

    public void setOutboundACH(org.museframework.bian.achoperations.dto.bq.OutboundACH outboundACH) {
        this.outboundACH = outboundACH;
    }

    public org.museframework.bian.achoperations.dto.bq.OutboundACH getOutboundACH() {
        return outboundACH;
    }
}