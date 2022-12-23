package org.museframework.bian.paymentinitiation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveOrderInitiationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.paymentinitiation.dto.bq.OrderInitiation orderInitiation;

    public void setOrderInitiation(org.museframework.bian.paymentinitiation.dto.bq.OrderInitiation orderInitiation) {
        this.orderInitiation = orderInitiation;
    }

    public org.museframework.bian.paymentinitiation.dto.bq.OrderInitiation getOrderInitiation() {
        return orderInitiation;
    }
}