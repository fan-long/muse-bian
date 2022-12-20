package org.museframework.bian.bracurman.dto;

public class ExchangeInventoryAllocationRequest {
    private String branchcurrencymanagementid;

    private String inventoryallocationid;

    private org.museframework.bian.bracurman.dto.bq.InventoryAllocation inventoryAllocation;

    public void setBranchcurrencymanagementid(String branchcurrencymanagementid) {
        this.branchcurrencymanagementid = branchcurrencymanagementid;
    }

    public String getBranchcurrencymanagementid() {
        return branchcurrencymanagementid;
    }

    public void setInventoryallocationid(String inventoryallocationid) {
        this.inventoryallocationid = inventoryallocationid;
    }

    public String getInventoryallocationid() {
        return inventoryallocationid;
    }

    public void setInventoryAllocation(org.museframework.bian.bracurman.dto.bq.InventoryAllocation inventoryAllocation) {
        this.inventoryAllocation = inventoryAllocation;
    }

    public org.museframework.bian.bracurman.dto.bq.InventoryAllocation getInventoryAllocation() {
        return inventoryAllocation;
    }
}