package org.museframework.bian.marinfman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteReportingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.marinfman.dto.bq.Reporting reporting;

    public void setReporting(org.museframework.bian.marinfman.dto.bq.Reporting reporting) {
        this.reporting = reporting;
    }

    public org.museframework.bian.marinfman.dto.bq.Reporting getReporting() {
        return reporting;
    }
}