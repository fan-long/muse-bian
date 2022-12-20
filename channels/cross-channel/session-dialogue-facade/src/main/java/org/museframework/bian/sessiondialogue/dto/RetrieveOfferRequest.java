package org.museframework.bian.sessiondialogue.dto;

public class RetrieveOfferRequest {
    private String sessiondialogueid;

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