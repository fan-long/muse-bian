package org.museframework.bian.corporateloan.dto;

public class UpdateCorporateLoanFacilityRequest {
    private String corporateloanid;

    private org.museframework.bian.corporateloan.dto.cr.CorporateLoanFacility corporateLoanFacility;

    public void setCorporateloanid(String corporateloanid) {
        this.corporateloanid = corporateloanid;
    }

    public String getCorporateloanid() {
        return corporateloanid;
    }

    public void setCorporateLoanFacility(org.museframework.bian.corporateloan.dto.cr.CorporateLoanFacility corporateLoanFacility) {
        this.corporateLoanFacility = corporateLoanFacility;
    }

    public org.museframework.bian.corporateloan.dto.cr.CorporateLoanFacility getCorporateLoanFacility() {
        return corporateLoanFacility;
    }
}