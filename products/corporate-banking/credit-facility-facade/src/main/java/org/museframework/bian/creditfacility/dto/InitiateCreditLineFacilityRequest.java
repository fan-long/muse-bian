package org.museframework.bian.creditfacility.dto;

public class InitiateCreditLineFacilityRequest {
    private org.museframework.bian.creditfacility.dto.cr.CreditLineFacility creditLineFacility;

    public void setCreditLineFacility(org.museframework.bian.creditfacility.dto.cr.CreditLineFacility creditLineFacility) {
        this.creditLineFacility = creditLineFacility;
    }

    public org.museframework.bian.creditfacility.dto.cr.CreditLineFacility getCreditLineFacility() {
        return creditLineFacility;
    }
}