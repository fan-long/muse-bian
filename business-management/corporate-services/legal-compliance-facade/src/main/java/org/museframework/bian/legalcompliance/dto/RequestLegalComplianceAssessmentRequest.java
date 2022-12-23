package org.museframework.bian.legalcompliance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestLegalComplianceAssessmentRequest {
    @MetaField
    private String legalcomplianceid;

    @MetaField(ref=true)
    private org.museframework.bian.legalcompliance.dto.cr.LegalComplianceAssessment legalComplianceAssessment;

    public void setLegalcomplianceid(String legalcomplianceid) {
        this.legalcomplianceid = legalcomplianceid;
    }

    public String getLegalcomplianceid() {
        return legalcomplianceid;
    }

    public void setLegalComplianceAssessment(org.museframework.bian.legalcompliance.dto.cr.LegalComplianceAssessment legalComplianceAssessment) {
        this.legalComplianceAssessment = legalComplianceAssessment;
    }

    public org.museframework.bian.legalcompliance.dto.cr.LegalComplianceAssessment getLegalComplianceAssessment() {
        return legalComplianceAssessment;
    }
}