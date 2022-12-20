package org.museframework.bian.creditfacility.dto;

public class UpdateCreditLineFacilityRequest {
    private String creditfacilityid;

    private org.museframework.bian.creditfacility.dto.cr.CreditLineFacility creditLineFacility;

    public void setCreditfacilityid(String creditfacilityid) {
        this.creditfacilityid = creditfacilityid;
    }

    public String getCreditfacilityid() {
        return creditfacilityid;
    }

    public void setCreditLineFacility(org.museframework.bian.creditfacility.dto.cr.CreditLineFacility creditLineFacility) {
        this.creditLineFacility = creditLineFacility;
    }

    public org.museframework.bian.creditfacility.dto.cr.CreditLineFacility getCreditLineFacility() {
        return creditLineFacility;
    }
}