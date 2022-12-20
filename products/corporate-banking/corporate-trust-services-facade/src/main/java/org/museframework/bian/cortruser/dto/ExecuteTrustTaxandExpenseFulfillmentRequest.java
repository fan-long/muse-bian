package org.museframework.bian.cortruser.dto;

public class ExecuteTrustTaxandExpenseFulfillmentRequest {
    private String corporatetrustservicesid;

    private String trusttaxandexpensefulfillmentid;

    private org.museframework.bian.cortruser.dto.bq.TrustTaxandExpenseFulfillment trustTaxandExpenseFulfillment;

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

    public void setTrustTaxandExpenseFulfillment(org.museframework.bian.cortruser.dto.bq.TrustTaxandExpenseFulfillment trustTaxandExpenseFulfillment) {
        this.trustTaxandExpenseFulfillment = trustTaxandExpenseFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.TrustTaxandExpenseFulfillment getTrustTaxandExpenseFulfillment() {
        return trustTaxandExpenseFulfillment;
    }
}