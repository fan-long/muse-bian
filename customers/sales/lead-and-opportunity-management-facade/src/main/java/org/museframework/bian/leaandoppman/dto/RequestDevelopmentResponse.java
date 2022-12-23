package org.museframework.bian.leaandoppman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestDevelopmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.leaandoppman.dto.bq.Development development;

    public void setDevelopment(org.museframework.bian.leaandoppman.dto.bq.Development development) {
        this.development = development;
    }

    public org.museframework.bian.leaandoppman.dto.bq.Development getDevelopment() {
        return development;
    }
}