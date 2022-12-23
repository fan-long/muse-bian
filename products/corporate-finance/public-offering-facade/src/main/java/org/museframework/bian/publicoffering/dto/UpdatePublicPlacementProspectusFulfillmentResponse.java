package org.museframework.bian.publicoffering.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePublicPlacementProspectusFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.publicoffering.dto.bq.PublicPlacementProspectusFulfillment publicPlacementProspectusFulfillment;

    public void setPublicPlacementProspectusFulfillment(org.museframework.bian.publicoffering.dto.bq.PublicPlacementProspectusFulfillment publicPlacementProspectusFulfillment) {
        this.publicPlacementProspectusFulfillment = publicPlacementProspectusFulfillment;
    }

    public org.museframework.bian.publicoffering.dto.bq.PublicPlacementProspectusFulfillment getPublicPlacementProspectusFulfillment() {
        return publicPlacementProspectusFulfillment;
    }
}