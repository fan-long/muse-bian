package org.museframework.bian.systemsadministration.dto;

public class UpdateInventoryRequest {
    private String systemsadministrationid;

    private String inventoryid;

    private org.museframework.bian.systemsadministration.dto.bq.Inventory inventory;

    public void setSystemsadministrationid(String systemsadministrationid) {
        this.systemsadministrationid = systemsadministrationid;
    }

    public String getSystemsadministrationid() {
        return systemsadministrationid;
    }

    public void setInventoryid(String inventoryid) {
        this.inventoryid = inventoryid;
    }

    public String getInventoryid() {
        return inventoryid;
    }

    public void setInventory(org.museframework.bian.systemsadministration.dto.bq.Inventory inventory) {
        this.inventory = inventory;
    }

    public org.museframework.bian.systemsadministration.dto.bq.Inventory getInventory() {
        return inventory;
    }
}