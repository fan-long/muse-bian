package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangePublicPlacementInstrumentSpecificationFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.publicoffering.dto.bq.PublicPlacementInstrumentSpecificationFulfillment publicPlacementInstrumentSpecificationFulfillment;

    public void setPublicPlacementInstrumentSpecificationFulfillment(org.museframework.bian.publicoffering.dto.bq.PublicPlacementInstrumentSpecificationFulfillment publicPlacementInstrumentSpecificationFulfillment) {
        this.publicPlacementInstrumentSpecificationFulfillment = publicPlacementInstrumentSpecificationFulfillment;
    }

    public org.museframework.bian.publicoffering.dto.bq.PublicPlacementInstrumentSpecificationFulfillment getPublicPlacementInstrumentSpecificationFulfillment() {
        return publicPlacementInstrumentSpecificationFulfillment;
    }
}