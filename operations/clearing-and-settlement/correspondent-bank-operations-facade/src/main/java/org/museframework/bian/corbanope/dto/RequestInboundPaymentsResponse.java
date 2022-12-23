package org.museframework.bian.corbanope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestInboundPaymentsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corbanope.dto.bq.InboundPayments inboundPayments;

    public void setInboundPayments(org.museframework.bian.corbanope.dto.bq.InboundPayments inboundPayments) {
        this.inboundPayments = inboundPayments;
    }

    public org.museframework.bian.corbanope.dto.bq.InboundPayments getInboundPayments() {
        return inboundPayments;
    }
}