package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateProductInitializationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.ProductInitialization productInitialization;

    public void setProductInitialization(org.museframework.bian.customeroffer.dto.bq.ProductInitialization productInitialization) {
        this.productInitialization = productInitialization;
    }

    public org.museframework.bian.customeroffer.dto.bq.ProductInitialization getProductInitialization() {
        return productInitialization;
    }
}