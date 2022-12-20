package org.museframework.bian.accountsreceivable.dto;

public class InitiateAccountsReceivableProcedureRequest {
    private org.museframework.bian.accountsreceivable.dto.cr.AccountsReceivableProcedure accountsReceivableProcedure;

    public void setAccountsReceivableProcedure(org.museframework.bian.accountsreceivable.dto.cr.AccountsReceivableProcedure accountsReceivableProcedure) {
        this.accountsReceivableProcedure = accountsReceivableProcedure;
    }

    public org.museframework.bian.accountsreceivable.dto.cr.AccountsReceivableProcedure getAccountsReceivableProcedure() {
        return accountsReceivableProcedure;
    }
}