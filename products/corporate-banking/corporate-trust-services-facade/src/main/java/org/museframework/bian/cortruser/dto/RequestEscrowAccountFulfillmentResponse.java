package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestEscrowAccountFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cortruser.dto.bq.EscrowAccountFulfillment escrowAccountFulfillment;

    public void setEscrowAccountFulfillment(org.museframework.bian.cortruser.dto.bq.EscrowAccountFulfillment escrowAccountFulfillment) {
        this.escrowAccountFulfillment = escrowAccountFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.EscrowAccountFulfillment getEscrowAccountFulfillment() {
        return escrowAccountFulfillment;
    }
}