package org.museframework.bian.paymentorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrievePaymentOrderProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.paymentorder.dto.cr.PaymentOrderProcedure paymentOrderProcedure;

    public void setPaymentOrderProcedure(org.museframework.bian.paymentorder.dto.cr.PaymentOrderProcedure paymentOrderProcedure) {
        this.paymentOrderProcedure = paymentOrderProcedure;
    }

    public org.museframework.bian.paymentorder.dto.cr.PaymentOrderProcedure getPaymentOrderProcedure() {
        return paymentOrderProcedure;
    }
}