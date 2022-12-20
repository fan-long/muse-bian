package org.museframework.bian.standingorder.dto;

public class InitiateStandingOrderFacilityResponse {
    private org.museframework.bian.standingorder.dto.cr.StandingOrderFacility standingOrderFacility;

    public void setStandingOrderFacility(org.museframework.bian.standingorder.dto.cr.StandingOrderFacility standingOrderFacility) {
        this.standingOrderFacility = standingOrderFacility;
    }

    public org.museframework.bian.standingorder.dto.cr.StandingOrderFacility getStandingOrderFacility() {
        return standingOrderFacility;
    }
}