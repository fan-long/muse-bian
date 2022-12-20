package org.museframework.bian.proquaass.dto;

public class UpdateProductandServiceAssessmentRequest {
    private String productqualityassuranceid;

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