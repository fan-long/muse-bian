package org.museframework.bian.corcuracc.dto;

public class RetrieveAccountLienResponse {
    private org.museframework.bian.corcuracc.dto.bq.AccountLien accountLien;

    public void setAccountLien(org.museframework.bian.corcuracc.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.corcuracc.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}