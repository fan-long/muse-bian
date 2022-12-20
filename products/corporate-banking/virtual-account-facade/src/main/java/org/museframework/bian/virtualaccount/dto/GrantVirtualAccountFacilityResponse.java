package org.museframework.bian.virtualaccount.dto;

public class GrantVirtualAccountFacilityResponse {
    private org.museframework.bian.virtualaccount.dto.cr.VirtualAccountFacility virtualAccountFacility;

    public void setVirtualAccountFacility(org.museframework.bian.virtualaccount.dto.cr.VirtualAccountFacility virtualAccountFacility) {
        this.virtualAccountFacility = virtualAccountFacility;
    }

    public org.museframework.bian.virtualaccount.dto.cr.VirtualAccountFacility getVirtualAccountFacility() {
        return virtualAccountFacility;
    }
}