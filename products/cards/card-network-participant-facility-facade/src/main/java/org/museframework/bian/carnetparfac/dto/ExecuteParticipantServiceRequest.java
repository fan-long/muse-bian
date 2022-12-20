package org.museframework.bian.carnetparfac.dto;

public class ExecuteParticipantServiceRequest {
    private String cardnetworkparticipantfacilityid;

    private String participantserviceid;

    private org.museframework.bian.carnetparfac.dto.bq.ParticipantService participantService;

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

    public void setParticipantService(org.museframework.bian.carnetparfac.dto.bq.ParticipantService participantService) {
        this.participantService = participantService;
    }

    public org.museframework.bian.carnetparfac.dto.bq.ParticipantService getParticipantService() {
        return participantService;
    }
}