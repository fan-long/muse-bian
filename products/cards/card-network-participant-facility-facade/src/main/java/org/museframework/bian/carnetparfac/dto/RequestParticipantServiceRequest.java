package org.museframework.bian.carnetparfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestParticipantServiceRequest {
    @MetaField
    private String cardnetworkparticipantfacilityid;

    @MetaField
    private String participantserviceid;

    @MetaField(ref=true)
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