package org.museframework.bian.bracurman.dto;

public class RetrieveInventoryAllocationRequest {
    private String branchcurrencymanagementid;

    private String inventoryallocationid;

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
}