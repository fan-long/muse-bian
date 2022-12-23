package org.museframework.bian.savingsaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDepositsandWithdrawalsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.savingsaccount.dto.bq.DepositsandWithdrawals depositsandWithdrawals;

    public void setDepositsandWithdrawals(org.museframework.bian.savingsaccount.dto.bq.DepositsandWithdrawals depositsandWithdrawals) {
        this.depositsandWithdrawals = depositsandWithdrawals;
    }

    public org.museframework.bian.savingsaccount.dto.bq.DepositsandWithdrawals getDepositsandWithdrawals() {
        return depositsandWithdrawals;
    }
}