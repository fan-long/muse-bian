package org.museframework.bian.issdevtra.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateExternalReportRequest {
    @MetaField
    private String issueddevicetrackingid;

    @MetaField
    private String externalreportid;

    @MetaField(ref=true)
    private org.museframework.bian.issdevtra.dto.bq.ExternalReport externalReport;

    public void setIssueddevicetrackingid(String issueddevicetrackingid) {
        this.issueddevicetrackingid = issueddevicetrackingid;
    }

    public String getIssueddevicetrackingid() {
        return issueddevicetrackingid;
    }

    public void setExternalreportid(String externalreportid) {
        this.externalreportid = externalreportid;
    }

    public String getExternalreportid() {
        return externalreportid;
    }

    public void setExternalReport(org.museframework.bian.issdevtra.dto.bq.ExternalReport externalReport) {
        this.externalReport = externalReport;
    }

    public org.museframework.bian.issdevtra.dto.bq.ExternalReport getExternalReport() {
        return externalReport;
    }
}