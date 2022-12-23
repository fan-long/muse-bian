package org.museframework.bian.busuniman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePerformanceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.busuniman.dto.bq.Performance performance;

    public void setPerformance(org.museframework.bian.busuniman.dto.bq.Performance performance) {
        this.performance = performance;
    }

    public org.museframework.bian.busuniman.dto.bq.Performance getPerformance() {
        return performance;
    }
}