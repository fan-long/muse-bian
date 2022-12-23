package org.museframework.bian.crerismod.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureFunctionalRequirementsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.crerismod.dto.bq.FunctionalRequirements functionalRequirements;

    public void setFunctionalRequirements(org.museframework.bian.crerismod.dto.bq.FunctionalRequirements functionalRequirements) {
        this.functionalRequirements = functionalRequirements;
    }

    public org.museframework.bian.crerismod.dto.bq.FunctionalRequirements getFunctionalRequirements() {
        return functionalRequirements;
    }
}