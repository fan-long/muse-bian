package org.museframework.bian.corporatelease.dto;

public class ExchangeCorporateLeaseFacilityResponse {
    private org.museframework.bian.corporatelease.dto.cr.CorporateLeaseFacility corporateLeaseFacility;

    public void setCorporateLeaseFacility(org.museframework.bian.corporatelease.dto.cr.CorporateLeaseFacility corporateLeaseFacility) {
        this.corporateLeaseFacility = corporateLeaseFacility;
    }

    public org.museframework.bian.corporatelease.dto.cr.CorporateLeaseFacility getCorporateLeaseFacility() {
        return corporateLeaseFacility;
    }
}