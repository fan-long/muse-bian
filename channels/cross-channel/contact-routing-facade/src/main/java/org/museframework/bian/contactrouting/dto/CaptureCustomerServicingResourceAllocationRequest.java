package org.museframework.bian.contactrouting.dto;

public class CaptureCustomerServicingResourceAllocationRequest {
    private String contactroutingid;

    private org.museframework.bian.contactrouting.dto.cr.CustomerServicingResourceAllocation customerServicingResourceAllocation;

    public void setContactroutingid(String contactroutingid) {
        this.contactroutingid = contactroutingid;
    }

    public String getContactroutingid() {
        return contactroutingid;
    }

    public void setCustomerServicingResourceAllocation(org.museframework.bian.contactrouting.dto.cr.CustomerServicingResourceAllocation customerServicingResourceAllocation) {
        this.customerServicingResourceAllocation = customerServicingResourceAllocation;
    }

    public org.museframework.bian.contactrouting.dto.cr.CustomerServicingResourceAllocation getCustomerServicingResourceAllocation() {
        return customerServicingResourceAllocation;
    }
}