package org.museframework.bian.casmanandaccser.dto;

public class UpdateAccountLienResponse {
    private org.museframework.bian.casmanandaccser.dto.bq.AccountLien accountLien;

    public void setAccountLien(org.museframework.bian.casmanandaccser.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}