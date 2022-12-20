package org.museframework.bian.poiofser.dto;

public class UpdateInventoryRequest {
    private String pointofserviceid;

    private String inventoryid;

    private org.museframework.bian.poiofser.dto.bq.Inventory inventory;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setInventoryid(String inventoryid) {
        this.inventoryid = inventoryid;
    }

    public String getInventoryid() {
        return inventoryid;
    }

    public void setInventory(org.museframework.bian.poiofser.dto.bq.Inventory inventory) {
        this.inventory = inventory;
    }

    public org.museframework.bian.poiofser.dto.bq.Inventory getInventory() {
        return inventory;
    }
}