package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateWithdrawalsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.Withdrawals withdrawals;

    public void setWithdrawals(org.museframework.bian.merchandisingloan.dto.bq.Withdrawals withdrawals) {
        this.withdrawals = withdrawals;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Withdrawals getWithdrawals() {
        return withdrawals;
    }
}