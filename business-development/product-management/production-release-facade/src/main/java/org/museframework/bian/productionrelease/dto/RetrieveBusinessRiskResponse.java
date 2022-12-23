package org.museframework.bian.productionrelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveBusinessRiskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productionrelease.dto.bq.BusinessRisk businessRisk;

    public void setBusinessRisk(org.museframework.bian.productionrelease.dto.bq.BusinessRisk businessRisk) {
        this.businessRisk = businessRisk;
    }

    public org.museframework.bian.productionrelease.dto.bq.BusinessRisk getBusinessRisk() {
        return businessRisk;
    }
}