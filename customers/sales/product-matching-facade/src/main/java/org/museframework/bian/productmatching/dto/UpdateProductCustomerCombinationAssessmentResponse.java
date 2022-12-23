package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateProductCustomerCombinationAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productmatching.dto.cr.ProductCustomerCombinationAssessment productCustomerCombinationAssessment;

    public void setProductCustomerCombinationAssessment(org.museframework.bian.productmatching.dto.cr.ProductCustomerCombinationAssessment productCustomerCombinationAssessment) {
        this.productCustomerCombinationAssessment = productCustomerCombinationAssessment;
    }

    public org.museframework.bian.productmatching.dto.cr.ProductCustomerCombinationAssessment getProductCustomerCombinationAssessment() {
        return productCustomerCombinationAssessment;
    }
}