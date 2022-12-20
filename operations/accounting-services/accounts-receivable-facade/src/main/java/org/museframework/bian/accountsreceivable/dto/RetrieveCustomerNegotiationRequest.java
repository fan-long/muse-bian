package org.museframework.bian.accountsreceivable.dto;

public class RetrieveCustomerNegotiationRequest {
    private String accountsreceivableid;

    private String customernegotiationid;

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
}