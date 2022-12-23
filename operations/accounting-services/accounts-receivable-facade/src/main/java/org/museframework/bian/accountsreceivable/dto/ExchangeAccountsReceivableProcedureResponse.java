package org.museframework.bian.accountsreceivable.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeAccountsReceivableProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.accountsreceivable.dto.cr.AccountsReceivableProcedure accountsReceivableProcedure;

    public void setAccountsReceivableProcedure(org.museframework.bian.accountsreceivable.dto.cr.AccountsReceivableProcedure accountsReceivableProcedure) {
        this.accountsReceivableProcedure = accountsReceivableProcedure;
    }

    public org.museframework.bian.accountsreceivable.dto.cr.AccountsReceivableProcedure getAccountsReceivableProcedure() {
        return accountsReceivableProcedure;
    }
}