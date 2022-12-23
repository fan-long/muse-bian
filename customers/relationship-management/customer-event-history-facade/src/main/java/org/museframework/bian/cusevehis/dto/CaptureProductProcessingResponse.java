package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureProductProcessingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusevehis.dto.bq.ProductProcessing productProcessing;

    public void setProductProcessing(org.museframework.bian.cusevehis.dto.bq.ProductProcessing productProcessing) {
        this.productProcessing = productProcessing;
    }

    public org.museframework.bian.cusevehis.dto.bq.ProductProcessing getProductProcessing() {
        return productProcessing;
    }
}