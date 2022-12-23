package org.museframework.bian.legalcompliance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveLegalComplianceAssessmentRequest {
    @MetaField
    private String legalcomplianceid;

    public void setLegalcomplianceid(String legalcomplianceid) {
        this.legalcomplianceid = legalcomplianceid;
    }

    public String getLegalcomplianceid() {
        return legalcomplianceid;
    }
}