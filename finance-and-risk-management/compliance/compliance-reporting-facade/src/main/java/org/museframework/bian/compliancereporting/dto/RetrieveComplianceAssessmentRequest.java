package org.museframework.bian.compliancereporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveComplianceAssessmentRequest {
    @MetaField
    private String compliancereportingid;

    @MetaField
    private String complianceassessmentid;

    public void setCompliancereportingid(String compliancereportingid) {
        this.compliancereportingid = compliancereportingid;
    }

    public String getCompliancereportingid() {
        return compliancereportingid;
    }

    public void setComplianceassessmentid(String complianceassessmentid) {
        this.complianceassessmentid = complianceassessmentid;
    }

    public String getComplianceassessmentid() {
        return complianceassessmentid;
    }
}