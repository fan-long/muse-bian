package org.museframework.bian.accountsreceivable.dto;

public class RequestCustomerNegotiationRequest {
    private String accountsreceivableid;

    private String customernegotiationid;

    private org.museframework.bian.accountsreceivable.dto.bq.CustomerNegotiation customerNegotiation;

    public void setAccountsreceivableid(String accountsreceivableid) {
        this.accountsreceivableid = accountsreceivableid;
    }

    public String getAccountsreceivableid() {
        return accountsreceivableid;
    }

    public void setCustomernegotiationid(String customernegotiationid) {
        this.customernegotiationid = customernegotiationid;
    }

    public String getCustomernegotiationid() {
        return customernegotiationid;
    }

    public void setCustomerNegotiation(org.museframework.bian.accountsreceivable.dto.bq.CustomerNegotiation customerNegotiation) {
        this.customerNegotiation = customerNegotiation;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.CustomerNegotiation getCustomerNegotiation() {
        return customerNegotiation;
    }
}