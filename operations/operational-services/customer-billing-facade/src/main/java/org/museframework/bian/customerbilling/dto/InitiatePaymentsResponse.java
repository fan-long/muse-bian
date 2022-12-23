package org.museframework.bian.customerbilling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiatePaymentsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerbilling.dto.bq.Payments payments;

    public void setPayments(org.museframework.bian.customerbilling.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.customerbilling.dto.bq.Payments getPayments() {
        return payments;
    }
}