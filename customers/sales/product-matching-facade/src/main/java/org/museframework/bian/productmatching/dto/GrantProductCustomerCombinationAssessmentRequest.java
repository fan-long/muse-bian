package org.museframework.bian.productmatching.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class GrantProductCustomerCombinationAssessmentRequest {
    @MetaField
    private String productmatchingid;

    @MetaField(ref=true)
    private org.museframework.bian.productmatching.dto.cr.ProductCustomerCombinationAssessment productCustomerCombinationAssessment;

    public void setProductmatchingid(String productmatchingid) {
        this.productmatchingid = productmatchingid;
    }

    public String getProductmatchingid() {
        return productmatchingid;
    }

    public void setProductCustomerCombinationAssessment(org.museframework.bian.productmatching.dto.cr.ProductCustomerCombinationAssessment productCustomerCombinationAssessment) {
        this.productCustomerCombinationAssessment = productCustomerCombinationAssessment;
    }

    public org.museframework.bian.productmatching.dto.cr.ProductCustomerCombinationAssessment getProductCustomerCombinationAssessment() {
        return productCustomerCombinationAssessment;
    }
}