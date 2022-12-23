package org.museframework.bian.productcombination.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateEmbeddedProductControlResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productcombination.dto.bq.EmbeddedProductControl embeddedProductControl;

    public void setEmbeddedProductControl(org.museframework.bian.productcombination.dto.bq.EmbeddedProductControl embeddedProductControl) {
        this.embeddedProductControl = embeddedProductControl;
    }

    public org.museframework.bian.productcombination.dto.bq.EmbeddedProductControl getEmbeddedProductControl() {
        return embeddedProductControl;
    }
}