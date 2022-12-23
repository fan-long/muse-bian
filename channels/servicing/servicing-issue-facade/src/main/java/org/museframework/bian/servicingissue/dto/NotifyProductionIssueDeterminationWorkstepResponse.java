package org.museframework.bian.servicingissue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyProductionIssueDeterminationWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.servicingissue.dto.bq.ProductionIssueDeterminationWorkstep productionIssueDeterminationWorkstep;

    public void setProductionIssueDeterminationWorkstep(org.museframework.bian.servicingissue.dto.bq.ProductionIssueDeterminationWorkstep productionIssueDeterminationWorkstep) {
        this.productionIssueDeterminationWorkstep = productionIssueDeterminationWorkstep;
    }

    public org.museframework.bian.servicingissue.dto.bq.ProductionIssueDeterminationWorkstep getProductionIssueDeterminationWorkstep() {
        return productionIssueDeterminationWorkstep;
    }
}