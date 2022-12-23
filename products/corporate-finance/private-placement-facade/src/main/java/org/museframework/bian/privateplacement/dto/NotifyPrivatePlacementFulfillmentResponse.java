package org.museframework.bian.privateplacement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyPrivatePlacementFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.privateplacement.dto.bq.PrivatePlacementFulfillment privatePlacementFulfillment;

    public void setPrivatePlacementFulfillment(org.museframework.bian.privateplacement.dto.bq.PrivatePlacementFulfillment privatePlacementFulfillment) {
        this.privatePlacementFulfillment = privatePlacementFulfillment;
    }

    public org.museframework.bian.privateplacement.dto.bq.PrivatePlacementFulfillment getPrivatePlacementFulfillment() {
        return privatePlacementFulfillment;
    }
}