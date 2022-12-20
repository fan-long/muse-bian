package org.museframework.bian.carnetparfac.dto;

public class RetrieveParticipantAccountRequest {
    private String cardnetworkparticipantfacilityid;

    private String participantaccountid;

    public void setCardnetworkparticipantfacilityid(String cardnetworkparticipantfacilityid) {
        this.cardnetworkparticipantfacilityid = cardnetworkparticipantfacilityid;
    }

    public String getCardnetworkparticipantfacilityid() {
        return cardnetworkparticipantfacilityid;
    }

    public void setParticipantaccountid(String participantaccountid) {
        this.participantaccountid = participantaccountid;
    }

    public String getParticipantaccountid() {
        return participantaccountid;
    }
}