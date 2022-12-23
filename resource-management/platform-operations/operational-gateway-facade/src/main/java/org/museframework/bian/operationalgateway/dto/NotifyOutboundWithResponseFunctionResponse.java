package org.museframework.bian.operationalgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyOutboundWithResponseFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.operationalgateway.dto.bq.OutboundWithResponseFunction outboundWithResponseFunction;

    public void setOutboundWithResponseFunction(org.museframework.bian.operationalgateway.dto.bq.OutboundWithResponseFunction outboundWithResponseFunction) {
        this.outboundWithResponseFunction = outboundWithResponseFunction;
    }

    public org.museframework.bian.operationalgateway.dto.bq.OutboundWithResponseFunction getOutboundWithResponseFunction() {
        return outboundWithResponseFunction;
    }
}