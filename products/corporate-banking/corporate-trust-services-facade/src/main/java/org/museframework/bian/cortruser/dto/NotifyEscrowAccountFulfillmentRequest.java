package org.museframework.bian.cortruser.dto;

public class NotifyEscrowAccountFulfillmentRequest {
    private String corporatetrustservicesid;

    private String escrowaccountfulfillmentid;

    public void setCorporatetrustservicesid(String corporatetrustservicesid) {
        this.corporatetrustservicesid = corporatetrustservicesid;
    }

    public String getCorporatetrustservicesid() {
        return corporatetrustservicesid;
    }

    public void setEscrowaccountfulfillmentid(String escrowaccountfulfillmentid) {
        this.escrowaccountfulfillmentid = escrowaccountfulfillmentid;
    }

    public String getEscrowaccountfulfillmentid() {
        return escrowaccountfulfillmentid;
    }
}