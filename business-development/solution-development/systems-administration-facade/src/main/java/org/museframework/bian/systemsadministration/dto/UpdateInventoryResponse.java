package org.museframework.bian.systemsadministration.dto;

public class UpdateInventoryResponse {
    private org.museframework.bian.systemsadministration.dto.bq.Inventory inventory;

    public void setInventory(org.museframework.bian.systemsadministration.dto.bq.Inventory inventory) {
        this.inventory = inventory;
    }

    public org.museframework.bian.systemsadministration.dto.bq.Inventory getInventory() {
        return inventory;
    }
}