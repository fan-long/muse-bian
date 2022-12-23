package org.museframework.bian.proinviteman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProductInventoryAllocationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proinviteman.dto.cr.ProductInventoryAllocation productInventoryAllocation;

    public void setProductInventoryAllocation(org.museframework.bian.proinviteman.dto.cr.ProductInventoryAllocation productInventoryAllocation) {
        this.productInventoryAllocation = productInventoryAllocation;
    }

    public org.museframework.bian.proinviteman.dto.cr.ProductInventoryAllocation getProductInventoryAllocation() {
        return productInventoryAllocation;
    }
}