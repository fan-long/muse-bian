package org.museframework.bian.poiofser.dto;

public class RetrieveInventoryRequest {
    private String pointofserviceid;

    private String inventoryid;

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
}