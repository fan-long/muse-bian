package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOfferRequest {
    @MetaField
    private String sessiondialogueid;

    @MetaField
    private String offerid;

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
}