package org.museframework.bian.bracurman.dto;

public class RetrieveInventoryAllocationResponse {
    private org.museframework.bian.bracurman.dto.bq.InventoryAllocation inventoryAllocation;

    public void setInventoryAllocation(org.museframework.bian.bracurman.dto.bq.InventoryAllocation inventoryAllocation) {
        this.inventoryAllocation = inventoryAllocation;
    }

    public org.museframework.bian.bracurman.dto.bq.InventoryAllocation getInventoryAllocation() {
        return inventoryAllocation;
    }
}