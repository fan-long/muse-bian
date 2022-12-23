package org.museframework.bian.paymentinitiation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOrderInitiationRequest {
    @MetaField
    private String paymentinitiationid;

    @MetaField
    private String orderinitiationid;

    public void setPaymentinitiationid(String paymentinitiationid) {
        this.paymentinitiationid = paymentinitiationid;
    }

    public String getPaymentinitiationid() {
        return paymentinitiationid;
    }

    public void setOrderinitiationid(String orderinitiationid) {
        this.orderinitiationid = orderinitiationid;
    }

    public String getOrderinitiationid() {
        return orderinitiationid;
    }
}