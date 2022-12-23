package org.museframework.bian.productdeployment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProductionSupportResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productdeployment.dto.bq.ProductionSupport productionSupport;

    public void setProductionSupport(org.museframework.bian.productdeployment.dto.bq.ProductionSupport productionSupport) {
        this.productionSupport = productionSupport;
    }

    public org.museframework.bian.productdeployment.dto.bq.ProductionSupport getProductionSupport() {
        return productionSupport;
    }
}