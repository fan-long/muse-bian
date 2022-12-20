package org.museframework.bian.currentaccount.dto;

public class UpdateAccountLienResponse {
    private org.museframework.bian.currentaccount.dto.bq.AccountLien accountLien;

    public void setAccountLien(org.museframework.bian.currentaccount.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.currentaccount.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}