package org.museframework.bian.directdebit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateReportingRequest {
    @MetaField
    private String directdebitid;

    @MetaField
    private String reportingid;

    @MetaField(ref=true)
    private org.museframework.bian.directdebit.dto.bq.Reporting reporting;

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setReportingid(String reportingid) {
        this.reportingid = reportingid;
    }

    public String getReportingid() {
        return reportingid;
    }

    public void setReporting(org.museframework.bian.directdebit.dto.bq.Reporting reporting) {
        this.reporting = reporting;
    }

    public org.museframework.bian.directdebit.dto.bq.Reporting getReporting() {
        return reporting;
    }
}