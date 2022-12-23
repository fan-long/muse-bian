package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureFunctionalSpecificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.systemdevelopment.dto.bq.FunctionalSpecification functionalSpecification;

    public void setFunctionalSpecification(org.museframework.bian.systemdevelopment.dto.bq.FunctionalSpecification functionalSpecification) {
        this.functionalSpecification = functionalSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.FunctionalSpecification getFunctionalSpecification() {
        return functionalSpecification;
    }
}