package org.museframework.bian.cortruser.dto;

public class RequestEscrowAccountFulfillmentRequest {
    private String corporatetrustservicesid;

    private String escrowaccountfulfillmentid;

    private org.museframework.bian.cortruser.dto.bq.EscrowAccountFulfillment escrowAccountFulfillment;

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

    public void setEscrowAccountFulfillment(org.museframework.bian.cortruser.dto.bq.EscrowAccountFulfillment escrowAccountFulfillment) {
        this.escrowAccountFulfillment = escrowAccountFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.EscrowAccountFulfillment getEscrowAccountFulfillment() {
        return escrowAccountFulfillment;
    }
}