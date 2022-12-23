package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateOfferRequest {
    @MetaField
    private String sessiondialogueid;

    @MetaField
    private String offerid;

    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.Offer offer;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setOfferid(String offerid) {
        this.offerid = offerid;
    }

    public String getOfferid() {
        return offerid;
    }

    public void setOffer(org.museframework.bian.sessiondialogue.dto.bq.Offer offer) {
        this.offer = offer;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Offer getOffer() {
        return offer;
    }
}