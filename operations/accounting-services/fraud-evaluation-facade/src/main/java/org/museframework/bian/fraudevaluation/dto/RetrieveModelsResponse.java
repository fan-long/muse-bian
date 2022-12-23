package org.museframework.bian.fraudevaluation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveModelsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fraudevaluation.dto.bq.Models models;

    public void setModels(org.museframework.bian.fraudevaluation.dto.bq.Models models) {
        this.models = models;
    }

    public org.museframework.bian.fraudevaluation.dto.bq.Models getModels() {
        return models;
    }
}