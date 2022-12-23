package org.museframework.bian.compliancereporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureComplianceAssessmentRequest {
    @MetaField
    private String compliancereportingid;

    @MetaField
    private String complianceassessmentid;

    @MetaField(ref=true)
    private org.museframework.bian.compliancereporting.dto.bq.ComplianceAssessment complianceAssessment;

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

    public void setComplianceAssessment(org.museframework.bian.compliancereporting.dto.bq.ComplianceAssessment complianceAssessment) {
        this.complianceAssessment = complianceAssessment;
    }

    public org.museframework.bian.compliancereporting.dto.bq.ComplianceAssessment getComplianceAssessment() {
        return complianceAssessment;
    }
}