package org.museframework.bian.termdeposit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAccountSweepRequest {
    @MetaField
    private String termdepositid;

    @MetaField
    private String accountsweepid;

    @MetaField(ref=true)
    private org.museframework.bian.termdeposit.dto.bq.AccountSweep accountSweep;

    public void setTermdepositid(String termdepositid) {
        this.termdepositid = termdepositid;
    }

    public String getTermdepositid() {
        return termdepositid;
    }

    public void setAccountsweepid(String accountsweepid) {
        this.accountsweepid = accountsweepid;
    }

    public String getAccountsweepid() {
        return accountsweepid;
    }

    public void setAccountSweep(org.museframework.bian.termdeposit.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.termdeposit.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}