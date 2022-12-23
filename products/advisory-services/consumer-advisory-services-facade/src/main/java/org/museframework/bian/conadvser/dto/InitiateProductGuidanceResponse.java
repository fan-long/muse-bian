package org.museframework.bian.conadvser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateProductGuidanceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.conadvser.dto.bq.ProductGuidance productGuidance;

    public void setProductGuidance(org.museframework.bian.conadvser.dto.bq.ProductGuidance productGuidance) {
        this.productGuidance = productGuidance;
    }

    public org.museframework.bian.conadvser.dto.bq.ProductGuidance getProductGuidance() {
        return productGuidance;
    }
}