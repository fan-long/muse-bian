package org.museframework.bian.proinviteman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProductInventoryAllocationRequest {
    @MetaField
    private String productinventoryitemmanagementid;

    @MetaField(ref=true)
    private org.museframework.bian.proinviteman.dto.cr.ProductInventoryAllocation productInventoryAllocation;

    public void setProductinventoryitemmanagementid(String productinventoryitemmanagementid) {
        this.productinventoryitemmanagementid = productinventoryitemmanagementid;
    }

    public String getProductinventoryitemmanagementid() {
        return productinventoryitemmanagementid;
    }

    public void setProductInventoryAllocation(org.museframework.bian.proinviteman.dto.cr.ProductInventoryAllocation productInventoryAllocation) {
        this.productInventoryAllocation = productInventoryAllocation;
    }

    public org.museframework.bian.proinviteman.dto.cr.ProductInventoryAllocation getProductInventoryAllocation() {
        return productInventoryAllocation;
    }
}