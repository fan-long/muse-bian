package org.museframework.bian.custodyadministration.dto;

public class RequestCustodyFacilityResponse {
    private org.museframework.bian.custodyadministration.dto.cr.CustodyFacility custodyFacility;

    public void setCustodyFacility(org.museframework.bian.custodyadministration.dto.cr.CustodyFacility custodyFacility) {
        this.custodyFacility = custodyFacility;
    }

    public org.museframework.bian.custodyadministration.dto.cr.CustodyFacility getCustodyFacility() {
        return custodyFacility;
    }
}