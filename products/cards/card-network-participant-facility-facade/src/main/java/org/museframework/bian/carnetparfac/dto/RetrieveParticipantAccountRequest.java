package org.museframework.bian.carnetparfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveParticipantAccountRequest {
    @MetaField
    private String cardnetworkparticipantfacilityid;

    @MetaField
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