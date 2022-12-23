package org.museframework.bian.productdesign.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFunctionalRequirementsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productdesign.dto.bq.FunctionalRequirements functionalRequirements;

    public void setFunctionalRequirements(org.museframework.bian.productdesign.dto.bq.FunctionalRequirements functionalRequirements) {
        this.functionalRequirements = functionalRequirements;
    }

    public org.museframework.bian.productdesign.dto.bq.FunctionalRequirements getFunctionalRequirements() {
        return functionalRequirements;
    }
}