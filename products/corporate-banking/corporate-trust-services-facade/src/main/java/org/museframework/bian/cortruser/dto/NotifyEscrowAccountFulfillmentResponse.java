package org.museframework.bian.cortruser.dto;

public class NotifyEscrowAccountFulfillmentResponse {
    private org.museframework.bian.cortruser.dto.bq.EscrowAccountFulfillment escrowAccountFulfillment;

    public void setEscrowAccountFulfillment(org.museframework.bian.cortruser.dto.bq.EscrowAccountFulfillment escrowAccountFulfillment) {
        this.escrowAccountFulfillment = escrowAccountFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.EscrowAccountFulfillment getEscrowAccountFulfillment() {
        return escrowAccountFulfillment;
    }
}