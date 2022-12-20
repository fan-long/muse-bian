package org.museframework.bian.leasing.dto;

public class ExchangeLeasingFacilityResponse {
    private org.museframework.bian.leasing.dto.cr.LeasingFacility leasingFacility;

    public void setLeasingFacility(org.museframework.bian.leasing.dto.cr.LeasingFacility leasingFacility) {
        this.leasingFacility = leasingFacility;
    }

    public org.museframework.bian.leasing.dto.cr.LeasingFacility getLeasingFacility() {
        return leasingFacility;
    }
}