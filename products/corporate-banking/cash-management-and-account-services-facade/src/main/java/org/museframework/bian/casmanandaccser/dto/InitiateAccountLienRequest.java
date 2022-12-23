package org.museframework.bian.casmanandaccser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateAccountLienRequest {
    @MetaField
    private String cashmanagementandaccountservicesid;

    @MetaField
    private String accountlienid;

    @MetaField(ref=true)
    private org.museframework.bian.casmanandaccser.dto.bq.AccountLien accountLien;

    public void setCashmanagementandaccountservicesid(String cashmanagementandaccountservicesid) {
        this.cashmanagementandaccountservicesid = cashmanagementandaccountservicesid;
    }

    public String getCashmanagementandaccountservicesid() {
        return cashmanagementandaccountservicesid;
    }

    public void setAccountlienid(String accountlienid) {
        this.accountlienid = accountlienid;
    }

    public String getAccountlienid() {
        return accountlienid;
    }

    public void setAccountLien(org.museframework.bian.casmanandaccser.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}