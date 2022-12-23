package org.museframework.bian.payraiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyPaymentClearingandSettlementFunctionRequest {
    @MetaField
    private String paymentrailoperationsid;

    @MetaField
    private String paymentclearingandsettlementfunctionid;

    public void setPaymentrailoperationsid(String paymentrailoperationsid) {
        this.paymentrailoperationsid = paymentrailoperationsid;
    }

    public String getPaymentrailoperationsid() {
        return paymentrailoperationsid;
    }

    public void setPaymentclearingandsettlementfunctionid(String paymentclearingandsettlementfunctionid) {
        this.paymentclearingandsettlementfunctionid = paymentclearingandsettlementfunctionid;
    }

    public String getPaymentclearingandsettlementfunctionid() {
        return paymentclearingandsettlementfunctionid;
    }
}