package org.museframework.bian.accountsreceivable.dto;

public class UpdateCustomerNegotiationResponse {
    private org.museframework.bian.accountsreceivable.dto.bq.CustomerNegotiation customerNegotiation;

    public void setCustomerNegotiation(org.museframework.bian.accountsreceivable.dto.bq.CustomerNegotiation customerNegotiation) {
        this.customerNegotiation = customerNegotiation;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.CustomerNegotiation getCustomerNegotiation() {
        return customerNegotiation;
    }
}