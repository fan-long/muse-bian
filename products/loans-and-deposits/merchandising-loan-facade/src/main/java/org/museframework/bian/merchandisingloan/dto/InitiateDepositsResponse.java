package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateDepositsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.Deposits deposits;

    public void setDeposits(org.museframework.bian.merchandisingloan.dto.bq.Deposits deposits) {
        this.deposits = deposits;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Deposits getDeposits() {
        return deposits;
    }
}