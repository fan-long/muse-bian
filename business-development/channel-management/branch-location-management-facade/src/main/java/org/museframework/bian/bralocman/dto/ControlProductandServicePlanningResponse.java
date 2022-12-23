package org.museframework.bian.bralocman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ControlProductandServicePlanningResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bralocman.dto.bq.ProductandServicePlanning productandServicePlanning;

    public void setProductandServicePlanning(org.museframework.bian.bralocman.dto.bq.ProductandServicePlanning productandServicePlanning) {
        this.productandServicePlanning = productandServicePlanning;
    }

    public org.museframework.bian.bralocman.dto.bq.ProductandServicePlanning getProductandServicePlanning() {
        return productandServicePlanning;
    }
}