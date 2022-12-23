package org.museframework.bian.custaxhan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveReportingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.custaxhan.dto.bq.Reporting reporting;

    public void setReporting(org.museframework.bian.custaxhan.dto.bq.Reporting reporting) {
        this.reporting = reporting;
    }

    public org.museframework.bian.custaxhan.dto.bq.Reporting getReporting() {
        return reporting;
    }
}