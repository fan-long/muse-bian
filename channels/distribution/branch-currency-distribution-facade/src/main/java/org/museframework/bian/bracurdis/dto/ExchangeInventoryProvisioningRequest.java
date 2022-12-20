package org.museframework.bian.bracurdis.dto;

public class ExchangeInventoryProvisioningRequest {
    private String branchcurrencydistributionid;

    private String inventoryprovisioningid;

    private org.museframework.bian.bracurdis.dto.bq.InventoryProvisioning inventoryProvisioning;

    public void setBranchcurrencydistributionid(String branchcurrencydistributionid) {
        this.branchcurrencydistributionid = branchcurrencydistributionid;
    }

    public String getBranchcurrencydistributionid() {
        return branchcurrencydistributionid;
    }

    public void setInventoryprovisioningid(String inventoryprovisioningid) {
        this.inventoryprovisioningid = inventoryprovisioningid;
    }

    public String getInventoryprovisioningid() {
        return inventoryprovisioningid;
    }

    public void setInventoryProvisioning(org.museframework.bian.bracurdis.dto.bq.InventoryProvisioning inventoryProvisioning) {
        this.inventoryProvisioning = inventoryProvisioning;
    }

    public org.museframework.bian.bracurdis.dto.bq.InventoryProvisioning getInventoryProvisioning() {
        return inventoryProvisioning;
    }
}