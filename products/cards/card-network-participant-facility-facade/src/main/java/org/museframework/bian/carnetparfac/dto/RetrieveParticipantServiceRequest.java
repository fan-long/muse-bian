package org.museframework.bian.carnetparfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveParticipantServiceRequest {
    @MetaField
    private String cardnetworkparticipantfacilityid;

    @MetaField
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