package org.museframework.bian.fiduciaryagreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveAssessmentandReportingRequest {
    @MetaField
    private String fiduciaryagreementid;

    @MetaField
    private String assessmentandreportingid;

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
}