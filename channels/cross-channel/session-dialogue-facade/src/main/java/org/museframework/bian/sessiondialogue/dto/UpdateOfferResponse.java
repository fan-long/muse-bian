package org.museframework.bian.sessiondialogue.dto;

public class UpdateOfferResponse {
    private org.museframework.bian.sessiondialogue.dto.bq.Offer offer;

    public void setOffer(org.museframework.bian.sessiondialogue.dto.bq.Offer offer) {
        this.offer = offer;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Offer getOffer() {
        return offer;
    }
}