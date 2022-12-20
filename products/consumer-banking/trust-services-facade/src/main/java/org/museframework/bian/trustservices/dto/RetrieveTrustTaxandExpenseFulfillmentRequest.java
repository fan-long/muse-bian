package org.museframework.bian.trustservices.dto;

public class RetrieveTrustTaxandExpenseFulfillmentRequest {
    private String trustservicesid;

    private String trusttaxandexpensefulfillmentid;

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
}