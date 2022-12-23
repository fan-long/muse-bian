package org.museframework.bian.issdevtra.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateExternalReportResponse {
    @MetaField(ref=true)
    private org.museframework.bian.issdevtra.dto.bq.ExternalReport externalReport;

    public void setExternalReport(org.museframework.bian.issdevtra.dto.bq.ExternalReport externalReport) {
        this.externalReport = externalReport;
    }

    public org.museframework.bian.issdevtra.dto.bq.ExternalReport getExternalReport() {
        return externalReport;
    }
}