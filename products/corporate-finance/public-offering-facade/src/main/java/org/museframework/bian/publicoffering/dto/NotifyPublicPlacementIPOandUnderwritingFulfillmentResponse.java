package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyPublicPlacementIPOandUnderwritingFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.publicoffering.dto.bq.PublicPlacementIPOandUnderwritingFulfillment publicPlacementIPOandUnderwritingFulfillment;

    public void setPublicPlacementIPOandUnderwritingFulfillment(org.museframework.bian.publicoffering.dto.bq.PublicPlacementIPOandUnderwritingFulfillment publicPlacementIPOandUnderwritingFulfillment) {
        this.publicPlacementIPOandUnderwritingFulfillment = publicPlacementIPOandUnderwritingFulfillment;
    }

    public org.museframework.bian.publicoffering.dto.bq.PublicPlacementIPOandUnderwritingFulfillment getPublicPlacementIPOandUnderwritingFulfillment() {
        return publicPlacementIPOandUnderwritingFulfillment;
    }
}