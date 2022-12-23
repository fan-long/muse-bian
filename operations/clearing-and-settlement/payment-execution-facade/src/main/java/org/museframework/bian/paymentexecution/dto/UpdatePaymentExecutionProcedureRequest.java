package org.museframework.bian.paymentexecution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePaymentExecutionProcedureRequest {
    @MetaField
    private String paymentexecutionid;

    @MetaField(ref=true)
    private org.museframework.bian.paymentexecution.dto.cr.PaymentExecutionProcedure paymentExecutionProcedure;

    public void setPaymentexecutionid(String paymentexecutionid) {
        this.paymentexecutionid = paymentexecutionid;
    }

    public String getPaymentexecutionid() {
        return paymentexecutionid;
    }

    public void setPaymentExecutionProcedure(org.museframework.bian.paymentexecution.dto.cr.PaymentExecutionProcedure paymentExecutionProcedure) {
        this.paymentExecutionProcedure = paymentExecutionProcedure;
    }

    public org.museframework.bian.paymentexecution.dto.cr.PaymentExecutionProcedure getPaymentExecutionProcedure() {
        return paymentExecutionProcedure;
    }
}