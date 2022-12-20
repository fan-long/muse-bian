package org.museframework.bian.leasing.dto;

public class ControlLeasingFacilityRequest {
    private String leasingid;

    private org.museframework.bian.leasing.dto.cr.LeasingFacility leasingFacility;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setLeasingFacility(org.museframework.bian.leasing.dto.cr.LeasingFacility leasingFacility) {
        this.leasingFacility = leasingFacility;
    }

    public org.museframework.bian.leasing.dto.cr.LeasingFacility getLeasingFacility() {
        return leasingFacility;
    }
}