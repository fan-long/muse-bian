package org.museframework.bian.proinviteman.dto;

public class RequestProductInventoryAllocationRequest {
    private String productinventoryitemmanagementid;

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