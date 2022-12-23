package org.museframework.bian.operationalgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeOutboundMessageFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.operationalgateway.dto.bq.OutboundMessageFunction outboundMessageFunction;

    public void setOutboundMessageFunction(org.museframework.bian.operationalgateway.dto.bq.OutboundMessageFunction outboundMessageFunction) {
        this.outboundMessageFunction = outboundMessageFunction;
    }

    public org.museframework.bian.operationalgateway.dto.bq.OutboundMessageFunction getOutboundMessageFunction() {
        return outboundMessageFunction;
    }
}