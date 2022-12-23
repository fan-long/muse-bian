package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTechnicalSpecificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.systemdevelopment.dto.bq.TechnicalSpecification technicalSpecification;

    public void setTechnicalSpecification(org.museframework.bian.systemdevelopment.dto.bq.TechnicalSpecification technicalSpecification) {
        this.technicalSpecification = technicalSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.TechnicalSpecification getTechnicalSpecification() {
        return technicalSpecification;
    }
}