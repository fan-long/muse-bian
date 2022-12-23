package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestProductionPlatformsandInfrastructureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.itstaandgui.dto.bq.ProductionPlatformsandInfrastructure productionPlatformsandInfrastructure;

    public void setProductionPlatformsandInfrastructure(org.museframework.bian.itstaandgui.dto.bq.ProductionPlatformsandInfrastructure productionPlatformsandInfrastructure) {
        this.productionPlatformsandInfrastructure = productionPlatformsandInfrastructure;
    }

    public org.museframework.bian.itstaandgui.dto.bq.ProductionPlatformsandInfrastructure getProductionPlatformsandInfrastructure() {
        return productionPlatformsandInfrastructure;
    }
}