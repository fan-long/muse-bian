package org.museframework.bian.productmatching.dto;

public class ExecuteProductCustomerCombinationAssessmentRequest {
    private String productmatchingid;

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