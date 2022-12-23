package org.museframework.bian.custaxhan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateReportingRequest {
    @MetaField
    private String customertaxhandlingid;

    @MetaField
    private String reportingid;

    @MetaField(ref=true)
    private org.museframework.bian.custaxhan.dto.bq.Reporting reporting;

    public void setCustomertaxhandlingid(String customertaxhandlingid) {
        this.customertaxhandlingid = customertaxhandlingid;
    }

    public String getCustomertaxhandlingid() {
        return customertaxhandlingid;
    }

    public void setReportingid(String reportingid) {
        this.reportingid = reportingid;
    }

    public String getReportingid() {
        return reportingid;
    }

    public void setReporting(org.museframework.bian.custaxhan.dto.bq.Reporting reporting) {
        this.reporting = reporting;
    }

    public org.museframework.bian.custaxhan.dto.bq.Reporting getReporting() {
        return reporting;
    }
}