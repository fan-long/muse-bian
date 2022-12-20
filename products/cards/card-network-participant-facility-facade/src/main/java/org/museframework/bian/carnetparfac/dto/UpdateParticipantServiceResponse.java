package org.museframework.bian.carnetparfac.dto;

public class UpdateParticipantServiceResponse {
    private org.museframework.bian.carnetparfac.dto.bq.ParticipantService participantService;

    public void setParticipantService(org.museframework.bian.carnetparfac.dto.bq.ParticipantService participantService) {
        this.participantService = participantService;
    }

    public org.museframework.bian.carnetparfac.dto.bq.ParticipantService getParticipantService() {
        return participantService;
    }
}