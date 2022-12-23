package org.museframework.bian.operationalgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyInboundMessageFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.operationalgateway.dto.bq.InboundMessageFunction inboundMessageFunction;

    public void setInboundMessageFunction(org.museframework.bian.operationalgateway.dto.bq.InboundMessageFunction inboundMessageFunction) {
        this.inboundMessageFunction = inboundMessageFunction;
    }

    public org.museframework.bian.operationalgateway.dto.bq.InboundMessageFunction getInboundMessageFunction() {
        return inboundMessageFunction;
    }
}