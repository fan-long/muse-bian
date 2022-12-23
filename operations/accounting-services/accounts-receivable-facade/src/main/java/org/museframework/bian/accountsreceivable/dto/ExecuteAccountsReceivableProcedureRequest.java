package org.museframework.bian.accountsreceivable.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteAccountsReceivableProcedureRequest {
    @MetaField
    private String accountsreceivableid;

    @MetaField(ref=true)
    private org.museframework.bian.accountsreceivable.dto.cr.AccountsReceivableProcedure accountsReceivableProcedure;

    public void setAccountsreceivableid(String accountsreceivableid) {
        this.accountsreceivableid = accountsreceivableid;
    }

    public String getAccountsreceivableid() {
        return accountsreceivableid;
    }

    public void setAccountsReceivableProcedure(org.museframework.bian.accountsreceivable.dto.cr.AccountsReceivableProcedure accountsReceivableProcedure) {
        this.accountsReceivableProcedure = accountsReceivableProcedure;
    }

    public org.museframework.bian.accountsreceivable.dto.cr.AccountsReceivableProcedure getAccountsReceivableProcedure() {
        return accountsReceivableProcedure;
    }
}