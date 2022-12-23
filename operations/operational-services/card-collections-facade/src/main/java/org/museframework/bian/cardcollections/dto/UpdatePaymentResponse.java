package org.museframework.bian.cardcollections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePaymentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardcollections.dto.bq.Payment payment;

    public void setPayment(org.museframework.bian.cardcollections.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.cardcollections.dto.bq.Payment getPayment() {
        return payment;
    }
}