package org.museframework.bian.cuscamman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CreatePerformanceAssessmentRequest {
    @MetaField
    private String customercampaignmanagementid;

    @MetaField
    private String performanceassessmentid;

    @MetaField(ref=true)
    private org.museframework.bian.cuscamman.dto.bq.PerformanceAssessment performanceAssessment;

    public void setCustomercampaignmanagementid(String customercampaignmanagementid) {
        this.customercampaignmanagementid = customercampaignmanagementid;
    }

    public String getCustomercampaignmanagementid() {
        return customercampaignmanagementid;
    }

    public void setPerformanceassessmentid(String performanceassessmentid) {
        this.performanceassessmentid = performanceassessmentid;
    }

    public String getPerformanceassessmentid() {
        return performanceassessmentid;
    }

    public void setPerformanceAssessment(org.museframework.bian.cuscamman.dto.bq.PerformanceAssessment performanceAssessment) {
        this.performanceAssessment = performanceAssessment;
    }

    public org.museframework.bian.cuscamman.dto.bq.PerformanceAssessment getPerformanceAssessment() {
        return performanceAssessment;
    }
}