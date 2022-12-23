package org.museframework.bian.privateplacement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyPrivatePlacementInstrumentSpecificationFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentSpecificationFulfillment privatePlacementInstrumentSpecificationFulfillment;

    public void setPrivatePlacementInstrumentSpecificationFulfillment(org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentSpecificationFulfillment privatePlacementInstrumentSpecificationFulfillment) {
        this.privatePlacementInstrumentSpecificationFulfillment = privatePlacementInstrumentSpecificationFulfillment;
    }

    public org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentSpecificationFulfillment getPrivatePlacementInstrumentSpecificationFulfillment() {
        return privatePlacementInstrumentSpecificationFulfillment;
    }
}