package org.museframework.bian.sessiondialogue.dto;

public class UpdateOfferRequest {
    private String sessiondialogueid;

    private String offerid;

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