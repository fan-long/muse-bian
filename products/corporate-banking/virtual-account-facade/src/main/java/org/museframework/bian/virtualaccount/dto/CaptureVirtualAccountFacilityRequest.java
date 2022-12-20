package org.museframework.bian.virtualaccount.dto;

public class CaptureVirtualAccountFacilityRequest {
    private String virtualaccountid;

    private org.museframework.bian.virtualaccount.dto.cr.VirtualAccountFacility virtualAccountFacility;

    public void setVirtualaccountid(String virtualaccountid) {
        this.virtualaccountid = virtualaccountid;
    }

    public String getVirtualaccountid() {
        return virtualaccountid;
    }

    public void setVirtualAccountFacility(org.museframework.bian.virtualaccount.dto.cr.VirtualAccountFacility virtualAccountFacility) {
        this.virtualAccountFacility = virtualAccountFacility;
    }

    public org.museframework.bian.virtualaccount.dto.cr.VirtualAccountFacility getVirtualAccountFacility() {
        return virtualAccountFacility;
    }
}