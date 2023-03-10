package org.museframework.bian.cuscrerat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureExternalReportingRequest {
    @MetaField
    private String customercreditratingid;

    @MetaField
    private String externalreportingid;

    @MetaField(ref=true)
    private org.museframework.bian.cuscrerat.dto.bq.ExternalReporting externalReporting;

    public void setCustomercreditratingid(String customercreditratingid) {
        this.customercreditratingid = customercreditratingid;
    }

    public String getCustomercreditratingid() {
        return customercreditratingid;
    }

    public void setExternalreportingid(String externalreportingid) {
        this.externalreportingid = externalreportingid;
    }

    public String getExternalreportingid() {
        return externalreportingid;
    }

    public void setExternalReporting(org.museframework.bian.cuscrerat.dto.bq.ExternalReporting externalReporting) {
        this.externalReporting = externalReporting;
    }

    public org.museframework.bian.cuscrerat.dto.bq.ExternalReporting getExternalReporting() {
        return externalReporting;
    }
}