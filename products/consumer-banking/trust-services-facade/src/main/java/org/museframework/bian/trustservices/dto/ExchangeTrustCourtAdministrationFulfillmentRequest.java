package org.museframework.bian.trustservices.dto;

public class ExchangeTrustCourtAdministrationFulfillmentRequest {
    private String trustservicesid;

    private String trustcourtadministrationfulfillmentid;

    private org.museframework.bian.trustservices.dto.bq.TrustCourtAdministrationFulfillment trustCourtAdministrationFulfillment;

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

    public void setTrustCourtAdministrationFulfillment(org.museframework.bian.trustservices.dto.bq.TrustCourtAdministrationFulfillment trustCourtAdministrationFulfillment) {
        this.trustCourtAdministrationFulfillment = trustCourtAdministrationFulfillment;
    }

    public org.museframework.bian.trustservices.dto.bq.TrustCourtAdministrationFulfillment getTrustCourtAdministrationFulfillment() {
        return trustCourtAdministrationFulfillment;
    }
}