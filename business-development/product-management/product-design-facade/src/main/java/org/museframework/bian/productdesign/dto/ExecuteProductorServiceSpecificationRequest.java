package org.museframework.bian.productdesign.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteProductorServiceSpecificationRequest {
    @MetaField
    private String productdesignid;

    @MetaField(ref=true)
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