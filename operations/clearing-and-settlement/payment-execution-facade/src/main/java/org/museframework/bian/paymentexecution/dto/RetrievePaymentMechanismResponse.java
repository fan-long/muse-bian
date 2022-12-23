package org.museframework.bian.paymentexecution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrievePaymentMechanismResponse {
    @MetaField(ref=true)
    private org.museframework.bian.paymentexecution.dto.bq.PaymentMechanism paymentMechanism;

    public void setPaymentMechanism(org.museframework.bian.paymentexecution.dto.bq.PaymentMechanism paymentMechanism) {
        this.paymentMechanism = paymentMechanism;
    }

    public org.museframework.bian.paymentexecution.dto.bq.PaymentMechanism getPaymentMechanism() {
        return paymentMechanism;
    }
}