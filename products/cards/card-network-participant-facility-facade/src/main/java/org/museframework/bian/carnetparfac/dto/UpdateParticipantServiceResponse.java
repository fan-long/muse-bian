package org.museframework.bian.carnetparfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateParticipantServiceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.carnetparfac.dto.bq.ParticipantService participantService;

    public void setParticipantService(org.museframework.bian.carnetparfac.dto.bq.ParticipantService participantService) {
        this.participantService = participantService;
    }

    public org.museframework.bian.carnetparfac.dto.bq.ParticipantService getParticipantService() {
        return participantService;
    }
}