package org.museframework.bian.fiduciaryagreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fiduciaryagreement.dto.bq.Fulfillment fulfillment;

    public void setFulfillment(org.museframework.bian.fiduciaryagreement.dto.bq.Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public org.museframework.bian.fiduciaryagreement.dto.bq.Fulfillment getFulfillment() {
        return fulfillment;
    }
}