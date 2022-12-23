package org.museframework.bian.promotionalevents.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CreateParticipationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.promotionalevents.dto.bq.Participation participation;

    public void setParticipation(org.museframework.bian.promotionalevents.dto.bq.Participation participation) {
        this.participation = participation;
    }

    public org.museframework.bian.promotionalevents.dto.bq.Participation getParticipation() {
        return participation;
    }
}