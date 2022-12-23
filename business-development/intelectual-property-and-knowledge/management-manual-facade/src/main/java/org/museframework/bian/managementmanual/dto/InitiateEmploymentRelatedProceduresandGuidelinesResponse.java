package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateEmploymentRelatedProceduresandGuidelinesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.managementmanual.dto.bq.EmploymentRelatedProceduresandGuidelines employmentRelatedProceduresandGuidelines;

    public void setEmploymentRelatedProceduresandGuidelines(org.museframework.bian.managementmanual.dto.bq.EmploymentRelatedProceduresandGuidelines employmentRelatedProceduresandGuidelines) {
        this.employmentRelatedProceduresandGuidelines = employmentRelatedProceduresandGuidelines;
    }

    public org.museframework.bian.managementmanual.dto.bq.EmploymentRelatedProceduresandGuidelines getEmploymentRelatedProceduresandGuidelines() {
        return employmentRelatedProceduresandGuidelines;
    }
}