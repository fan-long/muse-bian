package org.museframework.bian.legalcompliance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestLegalComplianceAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.legalcompliance.dto.cr.LegalComplianceAssessment legalComplianceAssessment;

    public void setLegalComplianceAssessment(org.museframework.bian.legalcompliance.dto.cr.LegalComplianceAssessment legalComplianceAssessment) {
        this.legalComplianceAssessment = legalComplianceAssessment;
    }

    public org.museframework.bian.legalcompliance.dto.cr.LegalComplianceAssessment getLegalComplianceAssessment() {
        return legalComplianceAssessment;
    }
}