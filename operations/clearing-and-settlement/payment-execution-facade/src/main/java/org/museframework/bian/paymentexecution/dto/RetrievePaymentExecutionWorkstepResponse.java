package org.museframework.bian.paymentexecution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrievePaymentExecutionWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.paymentexecution.dto.bq.PaymentExecutionWorkstep paymentExecutionWorkstep;

    public void setPaymentExecutionWorkstep(org.museframework.bian.paymentexecution.dto.bq.PaymentExecutionWorkstep paymentExecutionWorkstep) {
        this.paymentExecutionWorkstep = paymentExecutionWorkstep;
    }

    public org.museframework.bian.paymentexecution.dto.bq.PaymentExecutionWorkstep getPaymentExecutionWorkstep() {
        return paymentExecutionWorkstep;
    }
}