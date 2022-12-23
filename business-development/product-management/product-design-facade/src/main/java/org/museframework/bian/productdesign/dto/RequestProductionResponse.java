package org.museframework.bian.productdesign.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestProductionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productdesign.dto.bq.Production production;

    public void setProduction(org.museframework.bian.productdesign.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.productdesign.dto.bq.Production getProduction() {
        return production;
    }
}