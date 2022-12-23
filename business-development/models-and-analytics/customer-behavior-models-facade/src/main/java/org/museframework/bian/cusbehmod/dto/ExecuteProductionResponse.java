package org.museframework.bian.cusbehmod.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteProductionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusbehmod.dto.bq.Production production;

    public void setProduction(org.museframework.bian.cusbehmod.dto.bq.Production production) {
        this.production = production;
    }

    public org.museframework.bian.cusbehmod.dto.bq.Production getProduction() {
        return production;
    }
}