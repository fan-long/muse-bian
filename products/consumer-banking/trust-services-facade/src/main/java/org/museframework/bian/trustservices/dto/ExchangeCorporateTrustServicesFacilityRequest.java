package org.museframework.bian.trustservices.dto;

public class ExchangeCorporateTrustServicesFacilityRequest {
    private String trustservicesid;

    private org.museframework.bian.trustservices.dto.cr.CorporateTrustServicesFacility corporateTrustServicesFacility;

    public void setTrustservicesid(String trustservicesid) {
        this.trustservicesid = trustservicesid;
    }

    public String getTrustservicesid() {
        return trustservicesid;
    }

    public void setCorporateTrustServicesFacility(org.museframework.bian.trustservices.dto.cr.CorporateTrustServicesFacility corporateTrustServicesFacility) {
        this.corporateTrustServicesFacility = corporateTrustServicesFacility;
    }

    public org.museframework.bian.trustservices.dto.cr.CorporateTrustServicesFacility getCorporateTrustServicesFacility() {
        return corporateTrustServicesFacility;
    }
}