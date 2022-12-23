package org.museframework.bian.corcuracc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAccountLienResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corcuracc.dto.bq.AccountLien accountLien;

    public void setAccountLien(org.museframework.bian.corcuracc.dto.bq.AccountLien accountLien) {
        this.accountLien = accountLien;
    }

    public org.museframework.bian.corcuracc.dto.bq.AccountLien getAccountLien() {
        return accountLien;
    }
}