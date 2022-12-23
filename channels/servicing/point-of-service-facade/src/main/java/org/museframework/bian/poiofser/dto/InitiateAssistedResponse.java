package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateAssistedResponse {
    @MetaField(ref=true)
    private org.museframework.bian.poiofser.dto.bq.Assisted assisted;

    public void setAssisted(org.museframework.bian.poiofser.dto.bq.Assisted assisted) {
        this.assisted = assisted;
    }

    public org.museframework.bian.poiofser.dto.bq.Assisted getAssisted() {
        return assisted;
    }
}