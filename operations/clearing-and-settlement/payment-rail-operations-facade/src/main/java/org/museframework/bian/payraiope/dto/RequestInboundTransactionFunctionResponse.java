package org.museframework.bian.payraiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestInboundTransactionFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.payraiope.dto.bq.InboundTransactionFunction inboundTransactionFunction;

    public void setInboundTransactionFunction(org.museframework.bian.payraiope.dto.bq.InboundTransactionFunction inboundTransactionFunction) {
        this.inboundTransactionFunction = inboundTransactionFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.InboundTransactionFunction getInboundTransactionFunction() {
        return inboundTransactionFunction;
    }
}