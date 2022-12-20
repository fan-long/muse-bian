package org.museframework.bian.corporateloan.dto;

public class UpdateCorporateLoanFacilityResponse {
    private org.museframework.bian.corporateloan.dto.cr.CorporateLoanFacility corporateLoanFacility;

    public void setCorporateLoanFacility(org.museframework.bian.corporateloan.dto.cr.CorporateLoanFacility corporateLoanFacility) {
        this.corporateLoanFacility = corporateLoanFacility;
    }

    public org.museframework.bian.corporateloan.dto.cr.CorporateLoanFacility getCorporateLoanFacility() {
        return corporateLoanFacility;
    }
}