package org.museframework.bian.procamman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePerformanceAssessmentRequest {
    @MetaField
    private String prospectcampaignmanagementid;

    @MetaField
    private String performanceassessmentid;

    @MetaField(ref=true)
    private org.museframework.bian.procamman.dto.bq.PerformanceAssessment performanceAssessment;

    public void setProspectcampaignmanagementid(String prospectcampaignmanagementid) {
        this.prospectcampaignmanagementid = prospectcampaignmanagementid;
    }

    public String getProspectcampaignmanagementid() {
        return prospectcampaignmanagementid;
    }

    public void setPerformanceassessmentid(String performanceassessmentid) {
        this.performanceassessmentid = performanceassessmentid;
    }

    public String getPerformanceassessmentid() {
        return performanceassessmentid;
    }

    public void setPerformanceAssessment(org.museframework.bian.procamman.dto.bq.PerformanceAssessment performanceAssessment) {
        this.performanceAssessment = performanceAssessment;
    }

    public org.museframework.bian.procamman.dto.bq.PerformanceAssessment getPerformanceAssessment() {
        return performanceAssessment;
    }
}