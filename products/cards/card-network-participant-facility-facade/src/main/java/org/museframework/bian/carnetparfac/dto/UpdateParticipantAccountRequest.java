package org.museframework.bian.carnetparfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateParticipantAccountRequest {
    @MetaField
    private String cardnetworkparticipantfacilityid;

    @MetaField
    private String participantaccountid;

    @MetaField(ref=true)
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