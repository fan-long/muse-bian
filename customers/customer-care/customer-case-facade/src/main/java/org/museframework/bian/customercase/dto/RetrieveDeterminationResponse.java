package org.museframework.bian.customercase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDeterminationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customercase.dto.bq.Determination determination;

    public void setDetermination(org.museframework.bian.customercase.dto.bq.Determination determination) {
        this.determination = determination;
    }

    public org.museframework.bian.customercase.dto.bq.Determination getDetermination() {
        return determination;
    }
}