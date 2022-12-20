package org.museframework.bian.corporatelease.dto;

public class ExecuteCorporateLeaseFacilityRequest {
    private String corporateleaseid;

    private org.museframework.bian.corporatelease.dto.cr.CorporateLeaseFacility corporateLeaseFacility;

    public void setCorporateleaseid(String corporateleaseid) {
        this.corporateleaseid = corporateleaseid;
    }

    public String getCorporateleaseid() {
        return corporateleaseid;
    }

    public void setCorporateLeaseFacility(org.museframework.bian.corporatelease.dto.cr.CorporateLeaseFacility corporateLeaseFacility) {
        this.corporateLeaseFacility = corporateLeaseFacility;
    }

    public org.museframework.bian.corporatelease.dto.cr.CorporateLeaseFacility getCorporateLeaseFacility() {
        return corporateLeaseFacility;
    }
}