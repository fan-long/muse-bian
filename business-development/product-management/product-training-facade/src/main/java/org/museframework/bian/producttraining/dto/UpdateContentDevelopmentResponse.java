package org.museframework.bian.producttraining.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateContentDevelopmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.producttraining.dto.bq.ContentDevelopment contentDevelopment;

    public void setContentDevelopment(org.museframework.bian.producttraining.dto.bq.ContentDevelopment contentDevelopment) {
        this.contentDevelopment = contentDevelopment;
    }

    public org.museframework.bian.producttraining.dto.bq.ContentDevelopment getContentDevelopment() {
        return contentDevelopment;
    }
}