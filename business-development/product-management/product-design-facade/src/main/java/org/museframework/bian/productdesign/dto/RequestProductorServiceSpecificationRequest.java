package org.museframework.bian.productdesign.dto;

public class RequestProductorServiceSpecificationRequest {
    private String productdesignid;

    private org.museframework.bian.productdesign.dto.cr.ProductorServiceSpecification productorServiceSpecification;

    public void setProductdesignid(String productdesignid) {
        this.productdesignid = productdesignid;
    }

    public String getProductdesignid() {
        return productdesignid;
    }

    public void setProductorServiceSpecification(org.museframework.bian.productdesign.dto.cr.ProductorServiceSpecification productorServiceSpecification) {
        this.productorServiceSpecification = productorServiceSpecification;
    }

    public org.museframework.bian.productdesign.dto.cr.ProductorServiceSpecification getProductorServiceSpecification() {
        return productorServiceSpecification;
    }
}