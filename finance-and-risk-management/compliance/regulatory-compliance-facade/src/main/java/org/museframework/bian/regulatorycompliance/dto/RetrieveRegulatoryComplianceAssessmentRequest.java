package org.museframework.bian.regulatorycompliance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRegulatoryComplianceAssessmentRequest {
    @MetaField
    private String regulatorycomplianceid;

    public void setRegulatorycomplianceid(String regulatorycomplianceid) {
        this.regulatorycomplianceid = regulatorycomplianceid;
    }

    public String getRegulatorycomplianceid() {
        return regulatorycomplianceid;
    }
}