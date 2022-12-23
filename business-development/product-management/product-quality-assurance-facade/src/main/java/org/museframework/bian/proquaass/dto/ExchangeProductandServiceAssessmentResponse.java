package org.museframework.bian.proquaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeProductandServiceAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proquaass.dto.cr.ProductandServiceAssessment productandServiceAssessment;

    public void setProductandServiceAssessment(org.museframework.bian.proquaass.dto.cr.ProductandServiceAssessment productandServiceAssessment) {
        this.productandServiceAssessment = productandServiceAssessment;
    }

    public org.museframework.bian.proquaass.dto.cr.ProductandServiceAssessment getProductandServiceAssessment() {
        return productandServiceAssessment;
    }
}