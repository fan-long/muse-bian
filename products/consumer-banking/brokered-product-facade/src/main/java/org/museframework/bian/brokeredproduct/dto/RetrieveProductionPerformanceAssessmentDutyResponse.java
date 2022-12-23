package org.museframework.bian.brokeredproduct.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProductionPerformanceAssessmentDutyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.brokeredproduct.dto.bq.ProductionPerformanceAssessmentDuty productionPerformanceAssessmentDuty;

    public void setProductionPerformanceAssessmentDuty(org.museframework.bian.brokeredproduct.dto.bq.ProductionPerformanceAssessmentDuty productionPerformanceAssessmentDuty) {
        this.productionPerformanceAssessmentDuty = productionPerformanceAssessmentDuty;
    }

    public org.museframework.bian.brokeredproduct.dto.bq.ProductionPerformanceAssessmentDuty getProductionPerformanceAssessmentDuty() {
        return productionPerformanceAssessmentDuty;
    }
}