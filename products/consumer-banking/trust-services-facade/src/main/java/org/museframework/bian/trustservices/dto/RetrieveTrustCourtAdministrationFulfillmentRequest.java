package org.museframework.bian.trustservices.dto;

public class RetrieveTrustCourtAdministrationFulfillmentRequest {
    private String trustservicesid;

    private String trustcourtadministrationfulfillmentid;

    public void setTrustservicesid(String trustservicesid) {
        this.trustservicesid = trustservicesid;
    }

    public String getTrustservicesid() {
        return trustservicesid;
    }

    public void setTrustcourtadministrationfulfillmentid(String trustcourtadministrationfulfillmentid) {
        this.trustcourtadministrationfulfillmentid = trustcourtadministrationfulfillmentid;
    }

    public String getTrustcourtadministrationfulfillmentid() {
        return trustcourtadministrationfulfillmentid;
    }
}