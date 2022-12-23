package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProductionEnvironmentandSupportServicesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.itstaandgui.dto.bq.ProductionEnvironmentandSupportServices productionEnvironmentandSupportServices;

    public void setProductionEnvironmentandSupportServices(org.museframework.bian.itstaandgui.dto.bq.ProductionEnvironmentandSupportServices productionEnvironmentandSupportServices) {
        this.productionEnvironmentandSupportServices = productionEnvironmentandSupportServices;
    }

    public org.museframework.bian.itstaandgui.dto.bq.ProductionEnvironmentandSupportServices getProductionEnvironmentandSupportServices() {
        return productionEnvironmentandSupportServices;
    }
}