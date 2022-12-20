package org.museframework.bian.accountsreceivable.dto;

public class ExchangeAccountsReceivableProcedureRequest {
    private String accountsreceivableid;

    private org.museframework.bian.accountsreceivable.dto.cr.AccountsReceivableProcedure accountsReceivableProcedure;

    public void setAccountsreceivableid(String accountsreceivableid) {
        this.accountsreceivableid = accountsreceivableid;
    }

    public String getAccountsreceivableid() {
        return accountsreceivableid;
    }

    public void setAccountsReceivableProcedure(org.museframework.bian.accountsreceivable.dto.cr.AccountsReceivableProcedure accountsReceivableProcedure) {
        this.accountsReceivableProcedure = accountsReceivableProcedure;
    }

    public org.museframework.bian.accountsreceivable.dto.cr.AccountsReceivableProcedure getAccountsReceivableProcedure() {
        return accountsReceivableProcedure;
    }
}