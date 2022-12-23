package org.museframework.bian.cuscrerat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureExternalReportingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cuscrerat.dto.bq.ExternalReporting externalReporting;

    public void setExternalReporting(org.museframework.bian.cuscrerat.dto.bq.ExternalReporting externalReporting) {
        this.externalReporting = externalReporting;
    }

    public org.museframework.bian.cuscrerat.dto.bq.ExternalReporting getExternalReporting() {
        return externalReporting;
    }
}