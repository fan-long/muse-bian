package org.museframework.bian.regulatorycompliance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateRegulatoryComplianceAssessmentRequest {
    @MetaField(ref=true)
    private org.museframework.bian.regulatorycompliance.dto.cr.RegulatoryComplianceAssessment regulatoryComplianceAssessment;

    public void setRegulatoryComplianceAssessment(org.museframework.bian.regulatorycompliance.dto.cr.RegulatoryComplianceAssessment regulatoryComplianceAssessment) {
        this.regulatoryComplianceAssessment = regulatoryComplianceAssessment;
    }

    public org.museframework.bian.regulatorycompliance.dto.cr.RegulatoryComplianceAssessment getRegulatoryComplianceAssessment() {
        return regulatoryComplianceAssessment;
    }
}