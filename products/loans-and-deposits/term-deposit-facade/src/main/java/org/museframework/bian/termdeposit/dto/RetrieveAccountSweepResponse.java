package org.museframework.bian.termdeposit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAccountSweepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.termdeposit.dto.bq.AccountSweep accountSweep;

    public void setAccountSweep(org.museframework.bian.termdeposit.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.termdeposit.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}