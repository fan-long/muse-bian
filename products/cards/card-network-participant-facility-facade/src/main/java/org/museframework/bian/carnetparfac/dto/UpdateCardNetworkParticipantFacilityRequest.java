package org.museframework.bian.carnetparfac.dto;

public class UpdateCardNetworkParticipantFacilityRequest {
    private String cardnetworkparticipantfacilityid;

    private org.museframework.bian.carnetparfac.dto.cr.CardNetworkParticipantFacility cardNetworkParticipantFacility;

    public void setCardnetworkparticipantfacilityid(String cardnetworkparticipantfacilityid) {
        this.cardnetworkparticipantfacilityid = cardnetworkparticipantfacilityid;
    }

    public String getCardnetworkparticipantfacilityid() {
        return cardnetworkparticipantfacilityid;
    }

    public void setCardNetworkParticipantFacility(org.museframework.bian.carnetparfac.dto.cr.CardNetworkParticipantFacility cardNetworkParticipantFacility) {
        this.cardNetworkParticipantFacility = cardNetworkParticipantFacility;
    }

    public org.museframework.bian.carnetparfac.dto.cr.CardNetworkParticipantFacility getCardNetworkParticipantFacility() {
        return cardNetworkParticipantFacility;
    }
}