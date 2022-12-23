package org.museframework.bian.customercase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateResolutionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customercase.dto.bq.Resolution resolution;

    public void setResolution(org.museframework.bian.customercase.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.customercase.dto.bq.Resolution getResolution() {
        return resolution;
    }
}