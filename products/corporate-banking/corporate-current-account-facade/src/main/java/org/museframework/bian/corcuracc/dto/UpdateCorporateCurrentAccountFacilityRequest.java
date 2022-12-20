package org.museframework.bian.corcuracc.dto;

public class UpdateCorporateCurrentAccountFacilityRequest {
    private String corporatecurrentaccountid;

    private org.museframework.bian.corcuracc.dto.cr.CorporateCurrentAccountFacility corporateCurrentAccountFacility;

    public void setCorporatecurrentaccountid(String corporatecurrentaccountid) {
        this.corporatecurrentaccountid = corporatecurrentaccountid;
    }

    public String getCorporatecurrentaccountid() {
        return corporatecurrentaccountid;
    }

    public void setCorporateCurrentAccountFacility(org.museframework.bian.corcuracc.dto.cr.CorporateCurrentAccountFacility corporateCurrentAccountFacility) {
        this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    }

    public org.museframework.bian.corcuracc.dto.cr.CorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
        return corporateCurrentAccountFacility;
    }
}