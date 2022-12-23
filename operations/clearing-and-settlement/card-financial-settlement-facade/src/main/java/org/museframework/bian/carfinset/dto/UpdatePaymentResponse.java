package org.museframework.bian.carfinset.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePaymentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.carfinset.dto.bq.Payment payment;

    public void setPayment(org.museframework.bian.carfinset.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.carfinset.dto.bq.Payment getPayment() {
        return payment;
    }
}