package org.museframework.bian.casmanandaccser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateAccountLienResponse {
    @MetaField(ref=true)
    private org.museframework.bian.casmanandaccser.dto.bq.AccountLien accountLien;

    public void setAccountLien(org.museframework.bian.casmanandaccser.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}