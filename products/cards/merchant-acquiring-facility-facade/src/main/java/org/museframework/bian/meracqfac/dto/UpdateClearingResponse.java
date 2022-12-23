package org.museframework.bian.meracqfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateClearingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.meracqfac.dto.bq.Clearing clearing;

    public void setClearing(org.museframework.bian.meracqfac.dto.bq.Clearing clearing) {
        this.clearing = clearing;
    }

    public org.museframework.bian.meracqfac.dto.bq.Clearing getClearing() {
        return clearing;
    }
}