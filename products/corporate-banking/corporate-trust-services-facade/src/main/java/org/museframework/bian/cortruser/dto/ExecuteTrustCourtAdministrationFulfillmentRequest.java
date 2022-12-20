package org.museframework.bian.cortruser.dto;

public class ExecuteTrustCourtAdministrationFulfillmentRequest {
    private String corporatetrustservicesid;

    private String trustcourtadministrationfulfillmentid;

    private org.museframework.bian.cortruser.dto.bq.TrustCourtAdministrationFulfillment trustCourtAdministrationFulfillment;

    public void setCorporatetrustservicesid(String corporatetrustservicesid) {
        this.corporatetrustservicesid = corporatetrustservicesid;
    }

    public String getCorporatetrustservicesid() {
        return corporatetrustservicesid;
    }

    public void setTrustcourtadministrationfulfillmentid(String trustcourtadministrationfulfillmentid) {
        this.trustcourtadministrationfulfillmentid = trustcourtadministrationfulfillmentid;
    }

    public String getTrustcourtadministrationfulfillmentid() {
        return trustcourtadministrationfulfillmentid;
    }

    public void setTrustCourtAdministrationFulfillment(org.museframework.bian.cortruser.dto.bq.TrustCourtAdministrationFulfillment trustCourtAdministrationFulfillment) {
        this.trustCourtAdministrationFulfillment = trustCourtAdministrationFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.TrustCourtAdministrationFulfillment getTrustCourtAdministrationFulfillment() {
        return trustCourtAdministrationFulfillment;
    }
}