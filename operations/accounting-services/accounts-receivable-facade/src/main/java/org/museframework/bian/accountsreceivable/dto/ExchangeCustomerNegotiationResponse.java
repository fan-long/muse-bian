package org.museframework.bian.accountsreceivable.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeCustomerNegotiationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.accountsreceivable.dto.bq.CustomerNegotiation customerNegotiation;

    public void setCustomerNegotiation(org.museframework.bian.accountsreceivable.dto.bq.CustomerNegotiation customerNegotiation) {
        this.customerNegotiation = customerNegotiation;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.CustomerNegotiation getCustomerNegotiation() {
        return customerNegotiation;
    }
}