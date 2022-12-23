package org.museframework.bian.corcuracc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateAccountSweepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corcuracc.dto.bq.AccountSweep accountSweep;

    public void setAccountSweep(org.museframework.bian.corcuracc.dto.bq.AccountSweep accountSweep) {
        this.accountSweep = accountSweep;
    }

    public org.museframework.bian.corcuracc.dto.bq.AccountSweep getAccountSweep() {
        return accountSweep;
    }
}