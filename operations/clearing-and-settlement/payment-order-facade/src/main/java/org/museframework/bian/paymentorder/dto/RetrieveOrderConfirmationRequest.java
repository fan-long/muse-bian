package org.museframework.bian.paymentorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOrderConfirmationRequest {
    @MetaField
    private String paymentorderid;

    @MetaField
    private String orderconfirmationid;

    public void setPaymentorderid(String paymentorderid) {
        this.paymentorderid = paymentorderid;
    }

    public String getPaymentorderid() {
        return paymentorderid;
    }

    public void setOrderconfirmationid(String orderconfirmationid) {
        this.orderconfirmationid = orderconfirmationid;
    }

    public String getOrderconfirmationid() {
        return orderconfirmationid;
    }
}