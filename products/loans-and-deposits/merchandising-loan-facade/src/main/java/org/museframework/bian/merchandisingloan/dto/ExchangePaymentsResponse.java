package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangePaymentsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.Payments payments;

    public void setPayments(org.museframework.bian.merchandisingloan.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Payments getPayments() {
        return payments;
    }
}