package org.museframework.bian.trustservices.dto;

public class ExchangeTrustTaxandExpenseFulfillmentRequest {
    private String trustservicesid;

    private String trusttaxandexpensefulfillmentid;

    private org.museframework.bian.trustservices.dto.bq.TrustTaxandExpenseFulfillment trustTaxandExpenseFulfillment;

    public void setTrustservicesid(String trustservicesid) {
        this.trustservicesid = trustservicesid;
    }

    public String getTrustservicesid() {
        return trustservicesid;
    }

    public void setTrusttaxandexpensefulfillmentid(String trusttaxandexpensefulfillmentid) {
        this.trusttaxandexpensefulfillmentid = trusttaxandexpensefulfillmentid;
    }

    public String getTrusttaxandexpensefulfillmentid() {
        return trusttaxandexpensefulfillmentid;
    }

    public void setTrustTaxandExpenseFulfillment(org.museframework.bian.trustservices.dto.bq.TrustTaxandExpenseFulfillment trustTaxandExpenseFulfillment) {
        this.trustTaxandExpenseFulfillment = trustTaxandExpenseFulfillment;
    }

    public org.museframework.bian.trustservices.dto.bq.TrustTaxandExpenseFulfillment getTrustTaxandExpenseFulfillment() {
        return trustTaxandExpenseFulfillment;
    }
}