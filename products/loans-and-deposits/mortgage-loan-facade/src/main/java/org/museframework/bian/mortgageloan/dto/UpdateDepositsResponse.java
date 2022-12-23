package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateDepositsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Deposits deposits;

    public void setDeposits(org.museframework.bian.mortgageloan.dto.bq.Deposits deposits) {
        this.deposits = deposits;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Deposits getDeposits() {
        return deposits;
    }
}