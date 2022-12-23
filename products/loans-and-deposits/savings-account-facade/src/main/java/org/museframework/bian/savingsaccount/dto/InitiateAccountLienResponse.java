package org.museframework.bian.savingsaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateAccountLienResponse {
    @MetaField(ref=true)
    private org.museframework.bian.savingsaccount.dto.bq.AccountLien accountLien;

    public void setAccountLien(org.museframework.bian.savingsaccount.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.savingsaccount.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}