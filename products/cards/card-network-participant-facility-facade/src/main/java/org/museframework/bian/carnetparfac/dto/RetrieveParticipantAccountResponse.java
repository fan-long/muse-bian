package org.museframework.bian.carnetparfac.dto;

public class RetrieveParticipantAccountResponse {
    private org.museframework.bian.carnetparfac.dto.bq.ParticipantAccount participantAccount;

    public void setParticipantAccount(org.museframework.bian.carnetparfac.dto.bq.ParticipantAccount participantAccount) {
        this.participantAccount = participantAccount;
    }

    public org.museframework.bian.carnetparfac.dto.bq.ParticipantAccount getParticipantAccount() {
        return participantAccount;
    }
}