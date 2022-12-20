package org.museframework.bian.contactrouting.dto;

public class RequestAllocationRequest {
    private String contactroutingid;

    private String allocationid;

    private org.museframework.bian.contactrouting.dto.bq.Allocation allocation;

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

    public void setAllocation(org.museframework.bian.contactrouting.dto.bq.Allocation allocation) {
        this.allocation = allocation;
    }

    public org.museframework.bian.contactrouting.dto.bq.Allocation getAllocation() {
        return allocation;
    }
}