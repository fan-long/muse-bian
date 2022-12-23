package org.museframework.bian.concenman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestPerformanceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.concenman.dto.bq.Performance performance;

    public void setPerformance(org.museframework.bian.concenman.dto.bq.Performance performance) {
        this.performance = performance;
    }

    public org.museframework.bian.concenman.dto.bq.Performance getPerformance() {
        return performance;
    }
}