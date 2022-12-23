package org.museframework.bian.segmentdirection.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestInitiativeResponse {
    @MetaField(ref=true)
    private org.museframework.bian.segmentdirection.dto.bq.Initiative initiative;

    public void setInitiative(org.museframework.bian.segmentdirection.dto.bq.Initiative initiative) {
        this.initiative = initiative;
    }

    public org.museframework.bian.segmentdirection.dto.bq.Initiative getInitiative() {
        return initiative;
    }
}