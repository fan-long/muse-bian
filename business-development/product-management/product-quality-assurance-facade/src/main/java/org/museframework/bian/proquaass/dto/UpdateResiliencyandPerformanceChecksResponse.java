package org.museframework.bian.proquaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateResiliencyandPerformanceChecksResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proquaass.dto.bq.ResiliencyandPerformanceChecks resiliencyandPerformanceChecks;

    public void setResiliencyandPerformanceChecks(org.museframework.bian.proquaass.dto.bq.ResiliencyandPerformanceChecks resiliencyandPerformanceChecks) {
        this.resiliencyandPerformanceChecks = resiliencyandPerformanceChecks;
    }

    public org.museframework.bian.proquaass.dto.bq.ResiliencyandPerformanceChecks getResiliencyandPerformanceChecks() {
        return resiliencyandPerformanceChecks;
    }
}