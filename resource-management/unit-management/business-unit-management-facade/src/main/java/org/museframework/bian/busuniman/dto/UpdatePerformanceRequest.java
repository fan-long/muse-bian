package org.museframework.bian.busuniman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePerformanceRequest {
    @MetaField
    private String businessunitmanagementid;

    @MetaField
    private String performanceid;

    @MetaField(ref=true)
    private org.museframework.bian.busuniman.dto.bq.Performance performance;

    public void setBusinessunitmanagementid(String businessunitmanagementid) {
        this.businessunitmanagementid = businessunitmanagementid;
    }

    public String getBusinessunitmanagementid() {
        return businessunitmanagementid;
    }

    public void setPerformanceid(String performanceid) {
        this.performanceid = performanceid;
    }

    public String getPerformanceid() {
        return performanceid;
    }

    public void setPerformance(org.museframework.bian.busuniman.dto.bq.Performance performance) {
        this.performance = performance;
    }

    public org.museframework.bian.busuniman.dto.bq.Performance getPerformance() {
        return performance;
    }
}