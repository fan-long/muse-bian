package org.museframework.bian.financialgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateOutboundResponse {
    @MetaField(ref=true)
    private org.museframework.bian.financialgateway.dto.bq.Outbound outbound;

    public void setOutbound(org.museframework.bian.financialgateway.dto.bq.Outbound outbound) {
        this.outbound = outbound;
    }

    public org.museframework.bian.financialgateway.dto.bq.Outbound getOutbound() {
        return outbound;
    }
}