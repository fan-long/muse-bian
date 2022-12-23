package org.museframework.bian.enterprisearchitecture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestTechnologyInfrastructureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.enterprisearchitecture.dto.bq.TechnologyInfrastructure technologyInfrastructure;

    public void setTechnologyInfrastructure(org.museframework.bian.enterprisearchitecture.dto.bq.TechnologyInfrastructure technologyInfrastructure) {
        this.technologyInfrastructure = technologyInfrastructure;
    }

    public org.museframework.bian.enterprisearchitecture.dto.bq.TechnologyInfrastructure getTechnologyInfrastructure() {
        return technologyInfrastructure;
    }
}