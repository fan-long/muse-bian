package org.museframework.bian.commissions.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrievePaymentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.commissions.dto.bq.Payment payment;

    public void setPayment(org.museframework.bian.commissions.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.commissions.dto.bq.Payment getPayment() {
        return payment;
    }
}