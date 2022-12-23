package org.museframework.bian.corcuracc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAccountSweepRequest {
    @MetaField
    private String corporatecurrentaccountid;

    @MetaField
    private String accountsweepid;

    @MetaField(ref=true)
    private org.museframework.bian.corcuracc.dto.bq.AccountSweep accountSweep;

    public void setCorporatecurrentaccountid(String corporatecurrentaccountid) {
        this.corporatecurrentaccountid = corporatecurrentaccountid;
    }

    public String getCorporatecurrentaccountid() {
        return corporatecurrentaccountid;
    }

    public void setAccountsweepid(String accountsweepid) {
        this.accountsweepid = accountsweepid;
    }

    public String getAccountsweepid() {
        return accountsweepid;
    }

    public void setAccountSweep(org.museframework.bian.corcuracc.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.corcuracc.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}