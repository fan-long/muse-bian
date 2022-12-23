package org.museframework.bian.cusrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestDevelopmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusrelman.dto.bq.Development development;

    public void setDevelopment(org.museframework.bian.cusrelman.dto.bq.Development development) {
        this.development = development;
    }

    public org.museframework.bian.cusrelman.dto.bq.Development getDevelopment() {
        return development;
    }
}