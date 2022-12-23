package org.museframework.bian.cuscasman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePerformanceRequest {
    @MetaField
    private String customercasemanagementid;

    @MetaField
    private String performanceid;

    @MetaField(ref=true)
    private org.museframework.bian.cuscasman.dto.bq.Performance performance;

    public void setCustomercasemanagementid(String customercasemanagementid) {
        this.customercasemanagementid = customercasemanagementid;
    }

    public String getCustomercasemanagementid() {
        return customercasemanagementid;
    }

    public void setPerformanceid(String performanceid) {
        this.performanceid = performanceid;
    }

    public String getPerformanceid() {
        return performanceid;
    }

    public void setPerformance(org.museframework.bian.cuscasman.dto.bq.Performance performance) {
        this.performance = performance;
    }

    public org.museframework.bian.cuscasman.dto.bq.Performance getPerformance() {
        return performance;
    }
}