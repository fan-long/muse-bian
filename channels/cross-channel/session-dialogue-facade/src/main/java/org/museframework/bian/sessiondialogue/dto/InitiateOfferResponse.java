package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateOfferResponse {
    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.Offer offer;

    public void setOffer(org.museframework.bian.sessiondialogue.dto.bq.Offer offer) {
        this.offer = offer;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Offer getOffer() {
        return offer;
    }
}