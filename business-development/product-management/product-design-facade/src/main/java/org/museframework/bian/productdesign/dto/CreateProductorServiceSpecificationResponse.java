package org.museframework.bian.productdesign.dto;

public class CreateProductorServiceSpecificationResponse {
    private org.museframework.bian.productdesign.dto.cr.ProductorServiceSpecification productorServiceSpecification;

    public void setProductorServiceSpecification(org.museframework.bian.productdesign.dto.cr.ProductorServiceSpecification productorServiceSpecification) {
        this.productorServiceSpecification = productorServiceSpecification;
    }

    public org.museframework.bian.productdesign.dto.cr.ProductorServiceSpecification getProductorServiceSpecification() {
        return productorServiceSpecification;
    }
}