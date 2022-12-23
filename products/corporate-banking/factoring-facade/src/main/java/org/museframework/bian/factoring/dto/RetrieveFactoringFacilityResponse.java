package org.museframework.bian.factoring.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFactoringFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.factoring.dto.cr.FactoringFacility factoringFacility;

    public void setFactoringFacility(org.museframework.bian.factoring.dto.cr.FactoringFacility factoringFacility) {
        this.factoringFacility = factoringFacility;
    }

    public org.museframework.bian.factoring.dto.cr.FactoringFacility getFactoringFacility() {
        return factoringFacility;
    }
}