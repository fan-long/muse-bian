package org.museframework.bian.savingsaccount.dto;

public class RetrieveAccountLienResponse {
    private org.museframework.bian.savingsaccount.dto.bq.AccountLien accountLien;

    public void setAccountLien(org.museframework.bian.savingsaccount.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.savingsaccount.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}