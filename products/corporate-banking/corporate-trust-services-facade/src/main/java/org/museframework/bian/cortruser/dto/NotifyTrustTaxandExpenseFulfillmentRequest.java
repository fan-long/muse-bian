package org.museframework.bian.cortruser.dto;

public class NotifyTrustTaxandExpenseFulfillmentRequest {
    private String corporatetrustservicesid;

    private String trusttaxandexpensefulfillmentid;

    public void setCorporatetrustservicesid(String corporatetrustservicesid) {
        this.corporatetrustservicesid = corporatetrustservicesid;
    }

    public String getCorporatetrustservicesid() {
        return corporatetrustservicesid;
    }

    public void setTrusttaxandexpensefulfillmentid(String trusttaxandexpensefulfillmentid) {
        this.trusttaxandexpensefulfillmentid = trusttaxandexpensefulfillmentid;
    }

    public String getTrusttaxandexpensefulfillmentid() {
        return trusttaxandexpensefulfillmentid;
    }
}