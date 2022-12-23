package org.museframework.bian.correspondence.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateOutboundWithResponseResponse {
    @MetaField(ref=true)
    private org.museframework.bian.correspondence.dto.bq.OutboundWithResponse outboundWithResponse;

    public void setOutboundWithResponse(org.museframework.bian.correspondence.dto.bq.OutboundWithResponse outboundWithResponse) {
        this.outboundWithResponse = outboundWithResponse;
    }

    public org.museframework.bian.correspondence.dto.bq.OutboundWithResponse getOutboundWithResponse() {
        return outboundWithResponse;
    }
}