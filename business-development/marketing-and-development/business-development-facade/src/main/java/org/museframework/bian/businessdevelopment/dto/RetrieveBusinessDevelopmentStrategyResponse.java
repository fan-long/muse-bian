package org.museframework.bian.businessdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveBusinessDevelopmentStrategyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.businessdevelopment.dto.cr.BusinessDevelopmentStrategy businessDevelopmentStrategy;

    public void setBusinessDevelopmentStrategy(org.museframework.bian.businessdevelopment.dto.cr.BusinessDevelopmentStrategy businessDevelopmentStrategy) {
        this.businessDevelopmentStrategy = businessDevelopmentStrategy;
    }

    public org.museframework.bian.businessdevelopment.dto.cr.BusinessDevelopmentStrategy getBusinessDevelopmentStrategy() {
        return businessDevelopmentStrategy;
    }
}