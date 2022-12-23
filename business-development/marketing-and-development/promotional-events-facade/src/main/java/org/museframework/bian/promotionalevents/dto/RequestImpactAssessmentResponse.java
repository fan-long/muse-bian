package org.museframework.bian.promotionalevents.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestImpactAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.promotionalevents.dto.bq.ImpactAssessment impactAssessment;

    public void setImpactAssessment(org.museframework.bian.promotionalevents.dto.bq.ImpactAssessment impactAssessment) {
        this.impactAssessment = impactAssessment;
    }

    public org.museframework.bian.promotionalevents.dto.bq.ImpactAssessment getImpactAssessment() {
        return impactAssessment;
    }
}