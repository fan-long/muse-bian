package org.museframework.bian.paymentexecution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrievePaymentExecutionProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.paymentexecution.dto.cr.PaymentExecutionProcedure paymentExecutionProcedure;

    public void setPaymentExecutionProcedure(org.museframework.bian.paymentexecution.dto.cr.PaymentExecutionProcedure paymentExecutionProcedure) {
        this.paymentExecutionProcedure = paymentExecutionProcedure;
    }

    public org.museframework.bian.paymentexecution.dto.cr.PaymentExecutionProcedure getPaymentExecutionProcedure() {
        return paymentExecutionProcedure;
    }
}