package org.museframework.bian.custodyadministration.dto;

public class RequestCustodyFacilityRequest {
    private String custodyadministrationid;

    private org.museframework.bian.custodyadministration.dto.cr.CustodyFacility custodyFacility;

    public void setCustodyadministrationid(String custodyadministrationid) {
        this.custodyadministrationid = custodyadministrationid;
    }

    public String getCustodyadministrationid() {
        return custodyadministrationid;
    }

    public void setCustodyFacility(org.museframework.bian.custodyadministration.dto.cr.CustodyFacility custodyFacility) {
        this.custodyFacility = custodyFacility;
    }

    public org.museframework.bian.custodyadministration.dto.cr.CustodyFacility getCustodyFacility() {
        return custodyFacility;
    }
}