package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateContextCriteriaResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productmatching.dto.bq.ContextCriteria contextCriteria;

    public void setContextCriteria(org.museframework.bian.productmatching.dto.bq.ContextCriteria contextCriteria) {
        this.contextCriteria = contextCriteria;
    }

    public org.museframework.bian.productmatching.dto.bq.ContextCriteria getContextCriteria() {
        return contextCriteria;
    }
}