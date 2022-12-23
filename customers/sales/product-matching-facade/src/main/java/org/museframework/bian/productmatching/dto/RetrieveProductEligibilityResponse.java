package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProductEligibilityResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productmatching.dto.bq.ProductEligibility productEligibility;

    public void setProductEligibility(org.museframework.bian.productmatching.dto.bq.ProductEligibility productEligibility) {
        this.productEligibility = productEligibility;
    }

    public org.museframework.bian.productmatching.dto.bq.ProductEligibility getProductEligibility() {
        return productEligibility;
    }
}