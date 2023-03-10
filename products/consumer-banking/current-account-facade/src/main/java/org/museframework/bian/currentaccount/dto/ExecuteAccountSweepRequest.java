package org.museframework.bian.currentaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteAccountSweepRequest {
    @MetaField
    private String currentaccountid;

    @MetaField
    private String accountsweepid;

    @MetaField(ref=true)
    private org.museframework.bian.currentaccount.dto.bq.AccountSweep accountSweep;

    public void setCurrentaccountid(String currentaccountid) {
        this.currentaccountid = currentaccountid;
    }

    public String getCurrentaccountid() {
        return currentaccountid;
    }

    public void setAccountsweepid(String accountsweepid) {
        this.accountsweepid = accountsweepid;
    }

    public String getAccountsweepid() {
        return accountsweepid;
    }

    public void setAccountSweep(org.museframework.bian.currentaccount.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.currentaccount.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}