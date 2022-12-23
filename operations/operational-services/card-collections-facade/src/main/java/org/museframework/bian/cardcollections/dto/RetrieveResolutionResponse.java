package org.museframework.bian.cardcollections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveResolutionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardcollections.dto.bq.Resolution resolution;

    public void setResolution(org.museframework.bian.cardcollections.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.cardcollections.dto.bq.Resolution getResolution() {
        return resolution;
    }
}