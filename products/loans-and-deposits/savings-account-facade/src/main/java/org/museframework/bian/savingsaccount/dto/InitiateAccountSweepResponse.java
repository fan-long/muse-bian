package org.museframework.bian.savingsaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateAccountSweepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.savingsaccount.dto.bq.AccountSweep accountSweep;

    public void setAccountSweep(org.museframework.bian.savingsaccount.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.savingsaccount.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}