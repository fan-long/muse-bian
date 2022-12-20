package org.museframework.bian.carnetparfac.dto;

public class RetrieveParticipantServiceRequest {
    private String cardnetworkparticipantfacilityid;

    private String participantserviceid;

    public void setCardnetworkparticipantfacilityid(String cardnetworkparticipantfacilityid) {
        this.cardnetworkparticipantfacilityid = cardnetworkparticipantfacilityid;
    }

    public String getCardnetworkparticipantfacilityid() {
        return cardnetworkparticipantfacilityid;
    }

    public void setParticipantserviceid(String participantserviceid) {
        this.participantserviceid = participantserviceid;
    }

    public String getParticipantserviceid() {
        return participantserviceid;
    }
}