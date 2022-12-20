package org.museframework.bian.termdeposit.dto;

public class UpdateAccountLienResponse {
    private org.museframework.bian.termdeposit.dto.bq.AccountLien accountLien;

    public void setAccountLien(org.museframework.bian.termdeposit.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.termdeposit.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}