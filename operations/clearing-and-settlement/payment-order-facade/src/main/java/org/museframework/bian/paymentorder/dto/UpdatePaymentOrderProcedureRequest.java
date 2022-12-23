package org.museframework.bian.paymentorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePaymentOrderProcedureRequest {
    @MetaField
    private String paymentorderid;

    @MetaField(ref=true)
    private org.museframework.bian.paymentorder.dto.cr.PaymentOrderProcedure paymentOrderProcedure;

    public void setPaymentorderid(String paymentorderid) {
        this.paymentorderid = paymentorderid;
    }

    public String getPaymentorderid() {
        return paymentorderid;
    }

    public void setPaymentOrderProcedure(org.museframework.bian.paymentorder.dto.cr.PaymentOrderProcedure paymentOrderProcedure) {
        this.paymentOrderProcedure = paymentOrderProcedure;
    }

    public org.museframework.bian.paymentorder.dto.cr.PaymentOrderProcedure getPaymentOrderProcedure() {
        return paymentOrderProcedure;
    }
}