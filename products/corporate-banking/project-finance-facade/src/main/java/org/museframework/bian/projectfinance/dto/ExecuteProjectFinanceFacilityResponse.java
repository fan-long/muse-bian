package org.museframework.bian.projectfinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteProjectFinanceFacilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.projectfinance.dto.cr.ProjectFinanceFacility projectFinanceFacility;

    public void setProjectFinanceFacility(org.museframework.bian.projectfinance.dto.cr.ProjectFinanceFacility projectFinanceFacility) {
        this.projectFinanceFacility = projectFinanceFacility;
    }

    public org.museframework.bian.projectfinance.dto.cr.ProjectFinanceFacility getProjectFinanceFacility() {
        return projectFinanceFacility;
    }
}