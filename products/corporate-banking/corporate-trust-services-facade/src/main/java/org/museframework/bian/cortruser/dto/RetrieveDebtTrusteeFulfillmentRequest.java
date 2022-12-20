package org.museframework.bian.cortruser.dto;

public class RetrieveDebtTrusteeFulfillmentRequest {
    private String corporatetrustservicesid;

    private String debttrusteefulfillmentid;

    public void setCorporatetrustservicesid(String corporatetrustservicesid) {
        this.corporatetrustservicesid = corporatetrustservicesid;
    }

    public String getCorporatetrustservicesid() {
        return corporatetrustservicesid;
    }

    public void setDebttrusteefulfillmentid(String debttrusteefulfillmentid) {
        this.debttrusteefulfillmentid = debttrusteefulfillmentid;
    }

    public String getDebttrusteefulfillmentid() {
        return debttrusteefulfillmentid;
    }
}