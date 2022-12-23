package org.museframework.bian.productionrelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProductionRiskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productionrelease.dto.bq.ProductionRisk productionRisk;

    public void setProductionRisk(org.museframework.bian.productionrelease.dto.bq.ProductionRisk productionRisk) {
        this.productionRisk = productionRisk;
    }

    public org.museframework.bian.productionrelease.dto.bq.ProductionRisk getProductionRisk() {
        return productionRisk;
    }
}