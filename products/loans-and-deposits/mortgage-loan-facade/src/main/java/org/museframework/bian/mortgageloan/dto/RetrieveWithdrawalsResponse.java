package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveWithdrawalsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Withdrawals withdrawals;

    public void setWithdrawals(org.museframework.bian.mortgageloan.dto.bq.Withdrawals withdrawals) {
        this.withdrawals = withdrawals;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Withdrawals getWithdrawals() {
        return withdrawals;
    }
}