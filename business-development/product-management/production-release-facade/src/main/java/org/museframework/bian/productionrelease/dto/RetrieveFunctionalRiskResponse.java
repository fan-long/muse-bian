package org.museframework.bian.productionrelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFunctionalRiskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productionrelease.dto.bq.FunctionalRisk functionalRisk;

    public void setFunctionalRisk(org.museframework.bian.productionrelease.dto.bq.FunctionalRisk functionalRisk) {
        this.functionalRisk = functionalRisk;
    }

    public org.museframework.bian.productionrelease.dto.bq.FunctionalRisk getFunctionalRisk() {
        return functionalRisk;
    }
}