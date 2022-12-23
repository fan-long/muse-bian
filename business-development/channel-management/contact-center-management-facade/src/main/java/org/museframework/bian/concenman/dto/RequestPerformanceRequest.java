package org.museframework.bian.concenman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestPerformanceRequest {
    @MetaField
    private String contactcentermanagementid;

    @MetaField
    private String performanceid;

    @MetaField(ref=true)
    private org.museframework.bian.concenman.dto.bq.Performance performance;

    public void setContactcentermanagementid(String contactcentermanagementid) {
        this.contactcentermanagementid = contactcentermanagementid;
    }

    public String getContactcentermanagementid() {
        return contactcentermanagementid;
    }

    public void setPerformanceid(String performanceid) {
        this.performanceid = performanceid;
    }

    public String getPerformanceid() {
        return performanceid;
    }

    public void setPerformance(org.museframework.bian.concenman.dto.bq.Performance performance) {
        this.performance = performance;
    }

    public org.museframework.bian.concenman.dto.bq.Performance getPerformance() {
        return performance;
    }
}