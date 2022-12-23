package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateProductorServiceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.ProductorService productorService;

    public void setProductorService(org.museframework.bian.sessiondialogue.dto.bq.ProductorService productorService) {
        this.productorService = productorService;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.ProductorService getProductorService() {
        return productorService;
    }
}