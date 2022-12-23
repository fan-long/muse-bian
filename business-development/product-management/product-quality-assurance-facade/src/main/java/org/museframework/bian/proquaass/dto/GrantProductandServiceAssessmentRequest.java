package org.museframework.bian.proquaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class GrantProductandServiceAssessmentRequest {
    @MetaField
    private String productqualityassuranceid;

    @MetaField(ref=true)
    private org.museframework.bian.proquaass.dto.cr.ProductandServiceAssessment productandServiceAssessment;

    public void setProductqualityassuranceid(String productqualityassuranceid) {
        this.productqualityassuranceid = productqualityassuranceid;
    }

    public String getProductqualityassuranceid() {
        return productqualityassuranceid;
    }

    public void setProductandServiceAssessment(org.museframework.bian.proquaass.dto.cr.ProductandServiceAssessment productandServiceAssessment) {
        this.productandServiceAssessment = productandServiceAssessment;
    }

    public org.museframework.bian.proquaass.dto.cr.ProductandServiceAssessment getProductandServiceAssessment() {
        return productandServiceAssessment;
    }
}