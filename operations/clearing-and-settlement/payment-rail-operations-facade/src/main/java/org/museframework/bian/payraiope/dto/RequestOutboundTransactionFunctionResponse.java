package org.museframework.bian.payraiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestOutboundTransactionFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.payraiope.dto.bq.OutboundTransactionFunction outboundTransactionFunction;

    public void setOutboundTransactionFunction(org.museframework.bian.payraiope.dto.bq.OutboundTransactionFunction outboundTransactionFunction) {
        this.outboundTransactionFunction = outboundTransactionFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.OutboundTransactionFunction getOutboundTransactionFunction() {
        return outboundTransactionFunction;
    }
}