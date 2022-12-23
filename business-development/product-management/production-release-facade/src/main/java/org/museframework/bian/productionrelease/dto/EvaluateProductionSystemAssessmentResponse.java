package org.museframework.bian.productionrelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class EvaluateProductionSystemAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productionrelease.dto.cr.ProductionSystemAssessment productionSystemAssessment;

    public void setProductionSystemAssessment(org.museframework.bian.productionrelease.dto.cr.ProductionSystemAssessment productionSystemAssessment) {
        this.productionSystemAssessment = productionSystemAssessment;
    }

    public org.museframework.bian.productionrelease.dto.cr.ProductionSystemAssessment getProductionSystemAssessment() {
        return productionSystemAssessment;
    }
}