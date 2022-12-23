package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveSystemsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productdeployment.dto.bq.Systems systems;

    public void setSystems(org.museframework.bian.productdeployment.dto.bq.Systems systems) {
        this.systems = systems;
    }

    public org.museframework.bian.productdeployment.dto.bq.Systems getSystems() {
        return systems;
    }
}