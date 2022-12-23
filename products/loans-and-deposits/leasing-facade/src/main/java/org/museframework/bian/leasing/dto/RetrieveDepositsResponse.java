package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDepositsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.Deposits deposits;

    public void setDeposits(org.museframework.bian.leasing.dto.bq.Deposits deposits) {
        this.deposits = deposits;
    }

    public org.museframework.bian.leasing.dto.bq.Deposits getDeposits() {
        return deposits;
    }
}