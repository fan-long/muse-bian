package org.museframework.bian.paymentorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveOrderConfirmationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.paymentorder.dto.bq.OrderConfirmation orderConfirmation;

    public void setOrderConfirmation(org.museframework.bian.paymentorder.dto.bq.OrderConfirmation orderConfirmation) {
        this.orderConfirmation = orderConfirmation;
    }

    public org.museframework.bian.paymentorder.dto.bq.OrderConfirmation getOrderConfirmation() {
        return orderConfirmation;
    }
}