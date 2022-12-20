package org.museframework.bian.bracurdis.dto;

public class UpdateInventoryProvisioningResponse {
    private org.museframework.bian.bracurdis.dto.bq.InventoryProvisioning inventoryProvisioning;

    public void setInventoryProvisioning(org.museframework.bian.bracurdis.dto.bq.InventoryProvisioning inventoryProvisioning) {
        this.inventoryProvisioning = inventoryProvisioning;
    }

    public org.museframework.bian.bracurdis.dto.bq.InventoryProvisioning getInventoryProvisioning() {
        return inventoryProvisioning;
    }
}