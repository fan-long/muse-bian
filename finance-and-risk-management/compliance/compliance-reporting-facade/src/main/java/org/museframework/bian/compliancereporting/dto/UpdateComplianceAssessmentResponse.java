package org.museframework.bian.compliancereporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateComplianceAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.compliancereporting.dto.bq.ComplianceAssessment complianceAssessment;

    public void setComplianceAssessment(org.museframework.bian.compliancereporting.dto.bq.ComplianceAssessment complianceAssessment) {
        this.complianceAssessment = complianceAssessment;
    }

    public org.museframework.bian.compliancereporting.dto.bq.ComplianceAssessment getComplianceAssessment() {
        return complianceAssessment;
    }
}