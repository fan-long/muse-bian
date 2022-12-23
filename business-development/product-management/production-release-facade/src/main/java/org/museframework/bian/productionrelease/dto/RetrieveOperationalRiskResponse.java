package org.museframework.bian.productionrelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveOperationalRiskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productionrelease.dto.bq.OperationalRisk operationalRisk;

    public void setOperationalRisk(org.museframework.bian.productionrelease.dto.bq.OperationalRisk operationalRisk) {
        this.operationalRisk = operationalRisk;
    }

    public org.museframework.bian.productionrelease.dto.bq.OperationalRisk getOperationalRisk() {
        return operationalRisk;
    }
}