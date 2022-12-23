package org.museframework.bian.cuscrerat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureInternalReportingRequest {
    @MetaField
    private String customercreditratingid;

    @MetaField
    private String internalreportingid;

    @MetaField(ref=true)
    private org.museframework.bian.cuscrerat.dto.bq.InternalReporting internalReporting;

    public void setCustomercreditratingid(String customercreditratingid) {
        this.customercreditratingid = customercreditratingid;
    }

    public String getCustomercreditratingid() {
        return customercreditratingid;
    }

    public void setInternalreportingid(String internalreportingid) {
        this.internalreportingid = internalreportingid;
    }

    public String getInternalreportingid() {
        return internalreportingid;
    }

    public void setInternalReporting(org.museframework.bian.cuscrerat.dto.bq.InternalReporting internalReporting) {
        this.internalReporting = internalReporting;
    }

    public org.museframework.bian.cuscrerat.dto.bq.InternalReporting getInternalReporting() {
        return internalReporting;
    }
}