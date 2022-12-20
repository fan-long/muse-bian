package org.museframework.bian.poiofser.dto;

public class ExecuteInventoryResponse {
    private org.museframework.bian.poiofser.dto.bq.Inventory inventory;

    public void setInventory(org.museframework.bian.poiofser.dto.bq.Inventory inventory) {
        this.inventory = inventory;
    }

    public org.museframework.bian.poiofser.dto.bq.Inventory getInventory() {
        return inventory;
    }
}