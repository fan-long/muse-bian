package org.museframework.bian.termdeposit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecutePaymentsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.termdeposit.dto.bq.Payments payments;

    public void setPayments(org.museframework.bian.termdeposit.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.termdeposit.dto.bq.Payments getPayments() {
        return payments;
    }
}