package org.museframework.bian.customersurveys.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDefinitionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customersurveys.dto.bq.Definition definition;

    public void setDefinition(org.museframework.bian.customersurveys.dto.bq.Definition definition) {
        this.definition = definition;
    }

    public org.museframework.bian.customersurveys.dto.bq.Definition getDefinition() {
        return definition;
    }
}