package org.museframework.bian.customerworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateProductandServiceAccessResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerworkbench.dto.bq.ProductandServiceAccess productandServiceAccess;

    public void setProductandServiceAccess(org.museframework.bian.customerworkbench.dto.bq.ProductandServiceAccess productandServiceAccess) {
        this.productandServiceAccess = productandServiceAccess;
    }

    public org.museframework.bian.customerworkbench.dto.bq.ProductandServiceAccess getProductandServiceAccess() {
        return productandServiceAccess;
    }
}