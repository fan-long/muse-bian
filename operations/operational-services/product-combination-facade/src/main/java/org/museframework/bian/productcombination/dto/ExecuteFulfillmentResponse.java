package org.museframework.bian.productcombination.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productcombination.dto.bq.Fulfillment fulfillment;

    public void setFulfillment(org.museframework.bian.productcombination.dto.bq.Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public org.museframework.bian.productcombination.dto.bq.Fulfillment getFulfillment() {
        return fulfillment;
    }
}