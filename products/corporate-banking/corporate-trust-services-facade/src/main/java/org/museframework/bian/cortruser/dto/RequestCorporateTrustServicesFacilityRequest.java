package org.museframework.bian.cortruser.dto;

public class RequestCorporateTrustServicesFacilityRequest {
    private String corporatetrustservicesid;

    private org.museframework.bian.cortruser.dto.cr.CorporateTrustServicesFacility corporateTrustServicesFacility;

    public void setCorporatetrustservicesid(String corporatetrustservicesid) {
        this.corporatetrustservicesid = corporatetrustservicesid;
    }

    public String getCorporatetrustservicesid() {
        return corporatetrustservicesid;
    }

    public void setCorporateTrustServicesFacility(org.museframework.bian.cortruser.dto.cr.CorporateTrustServicesFacility corporateTrustServicesFacility) {
        this.corporateTrustServicesFacility = corporateTrustServicesFacility;
    }

    public org.museframework.bian.cortruser.dto.cr.CorporateTrustServicesFacility getCorporateTrustServicesFacility() {
        return corporateTrustServicesFacility;
    }
}