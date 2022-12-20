package org.museframework.bian.carnetparfac.dto;

public class InitiateCardNetworkParticipantFacilityRequest {
    private org.museframework.bian.carnetparfac.dto.cr.CardNetworkParticipantFacility cardNetworkParticipantFacility;

    public void setCardNetworkParticipantFacility(org.museframework.bian.carnetparfac.dto.cr.CardNetworkParticipantFacility cardNetworkParticipantFacility) {
        this.cardNetworkParticipantFacility = cardNetworkParticipantFacility;
    }

    public org.museframework.bian.carnetparfac.dto.cr.CardNetworkParticipantFacility getCardNetworkParticipantFacility() {
        return cardNetworkParticipantFacility;
    }
}