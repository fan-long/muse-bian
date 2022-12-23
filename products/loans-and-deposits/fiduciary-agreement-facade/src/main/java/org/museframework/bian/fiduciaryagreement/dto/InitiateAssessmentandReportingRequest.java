package org.museframework.bian.fiduciaryagreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateAssessmentandReportingRequest {
    @MetaField
    private String fiduciaryagreementid;

    @MetaField
    private String assessmentandreportingid;

    @MetaField(ref=true)
    private org.museframework.bian.fiduciaryagreement.dto.bq.AssessmentandReporting assessmentandReporting;

    public void setFiduciaryagreementid(String fiduciaryagreementid) {
        this.fiduciaryagreementid = fiduciaryagreementid;
    }

    public String getFiduciaryagreementid() {
        return fiduciaryagreementid;
    }

    public void setAssessmentandreportingid(String assessmentandreportingid) {
        this.assessmentandreportingid = assessmentandreportingid;
    }

    public String getAssessmentandreportingid() {
        return assessmentandreportingid;
    }

    public void setAssessmentandReporting(org.museframework.bian.fiduciaryagreement.dto.bq.AssessmentandReporting assessmentandReporting) {
        this.assessmentandReporting = assessmentandReporting;
    }

    public org.museframework.bian.fiduciaryagreement.dto.bq.AssessmentandReporting getAssessmentandReporting() {
        return assessmentandReporting;
    }
}