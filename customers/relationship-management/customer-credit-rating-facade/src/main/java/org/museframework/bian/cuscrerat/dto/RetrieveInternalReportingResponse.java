package org.museframework.bian.cuscrerat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveInternalReportingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cuscrerat.dto.bq.InternalReporting internalReporting;

    public void setInternalReporting(org.museframework.bian.cuscrerat.dto.bq.InternalReporting internalReporting) {
        this.internalReporting = internalReporting;
    }

    public org.museframework.bian.cuscrerat.dto.bq.InternalReporting getInternalReporting() {
        return internalReporting;
    }
}