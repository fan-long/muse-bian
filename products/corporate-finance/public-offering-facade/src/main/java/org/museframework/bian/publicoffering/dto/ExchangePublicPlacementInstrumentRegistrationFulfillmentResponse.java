package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangePublicPlacementInstrumentRegistrationFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.publicoffering.dto.bq.PublicPlacementInstrumentRegistrationFulfillment publicPlacementInstrumentRegistrationFulfillment;

    public void setPublicPlacementInstrumentRegistrationFulfillment(org.museframework.bian.publicoffering.dto.bq.PublicPlacementInstrumentRegistrationFulfillment publicPlacementInstrumentRegistrationFulfillment) {
        this.publicPlacementInstrumentRegistrationFulfillment = publicPlacementInstrumentRegistrationFulfillment;
    }

    public org.museframework.bian.publicoffering.dto.bq.PublicPlacementInstrumentRegistrationFulfillment getPublicPlacementInstrumentRegistrationFulfillment() {
        return publicPlacementInstrumentRegistrationFulfillment;
    }
}