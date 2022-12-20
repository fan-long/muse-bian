package org.museframework.bian.contactrouting.dto;

public class RetrieveAllocationRequest {
    private String contactroutingid;

    private String allocationid;

    public void setContactroutingid(String contactroutingid) {
        this.contactroutingid = contactroutingid;
    }

    public String getContactroutingid() {
        return contactroutingid;
    }

    public void setAllocationid(String allocationid) {
        this.allocationid = allocationid;
    }

    public String getAllocationid() {
        return allocationid;
    }
}