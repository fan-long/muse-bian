package org.museframework.bian.carnetparfac.dto;

public class ExecuteParticipantAccountRequest {
    private String cardnetworkparticipantfacilityid;

    private String participantaccountid;

    private org.museframework.bian.carnetparfac.dto.bq.ParticipantAccount participantAccount;

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

    public void setParticipantAccount(org.museframework.bian.carnetparfac.dto.bq.ParticipantAccount participantAccount) {
        this.participantAccount = participantAccount;
    }

    public org.museframework.bian.carnetparfac.dto.bq.ParticipantAccount getParticipantAccount() {
        return participantAccount;
    }
}