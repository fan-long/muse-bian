package org.museframework.bian.regulatorycompliance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateRegulatoryComplianceAssessmentRequest {
    @MetaField
    private String regulatorycomplianceid;

    @MetaField(ref=true)
    private org.museframework.bian.regulatorycompliance.dto.cr.RegulatoryComplianceAssessment regulatoryComplianceAssessment;

    public void setRegulatorycomplianceid(String regulatorycomplianceid) {
        this.regulatorycomplianceid = regulatorycomplianceid;
    }

    public String getRegulatorycomplianceid() {
        return regulatorycomplianceid;
    }

    public void setRegulatoryComplianceAssessment(org.museframework.bian.regulatorycompliance.dto.cr.RegulatoryComplianceAssessment regulatoryComplianceAssessment) {
        this.regulatoryComplianceAssessment = regulatoryComplianceAssessment;
    }

    public org.museframework.bian.regulatorycompliance.dto.cr.RegulatoryComplianceAssessment getRegulatoryComplianceAssessment() {
        return regulatoryComplianceAssessment;
    }
}