package org.museframework.bian.systemsadministration.dto;

public class RetrieveInventoryRequest {
    private String systemsadministrationid;

    private String inventoryid;

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
}