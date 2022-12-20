package org.museframework.bian.proinviteman.dto;

public class RequestProductInventoryAllocationResponse {
    private org.museframework.bian.proinviteman.dto.cr.ProductInventoryAllocation productInventoryAllocation;

    public void setProductInventoryAllocation(org.museframework.bian.proinviteman.dto.cr.ProductInventoryAllocation productInventoryAllocation) {
        this.productInventoryAllocation = productInventoryAllocation;
    }

    public org.museframework.bian.proinviteman.dto.cr.ProductInventoryAllocation getProductInventoryAllocation() {
        return productInventoryAllocation;
    }
}