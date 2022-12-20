package org.museframework.bian.standingorder.dto;

public class ExecuteStandingOrderFacilityRequest {
    private String standingorderid;

    private org.museframework.bian.standingorder.dto.cr.StandingOrderFacility standingOrderFacility;

    public void setStandingorderid(String standingorderid) {
        this.standingorderid = standingorderid;
    }

    public String getStandingorderid() {
        return standingorderid;
    }

    public void setStandingOrderFacility(org.museframework.bian.standingorder.dto.cr.StandingOrderFacility standingOrderFacility) {
        this.standingOrderFacility = standingOrderFacility;
    }

    public org.museframework.bian.standingorder.dto.cr.StandingOrderFacility getStandingOrderFacility() {
        return standingOrderFacility;
    }
}