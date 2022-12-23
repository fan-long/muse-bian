package org.museframework.bian.syndicatedloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.syndicatedloan.dto.bq.Fulfillment fulfillment;

    public void setFulfillment(org.museframework.bian.syndicatedloan.dto.bq.Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.Fulfillment getFulfillment() {
        return fulfillment;
    }
}