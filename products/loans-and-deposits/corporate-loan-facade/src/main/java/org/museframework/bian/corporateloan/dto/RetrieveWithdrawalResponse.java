package org.museframework.bian.corporateloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveWithdrawalResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporateloan.dto.bq.Withdrawal withdrawal;

    public void setWithdrawal(org.museframework.bian.corporateloan.dto.bq.Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public org.museframework.bian.corporateloan.dto.bq.Withdrawal getWithdrawal() {
        return withdrawal;
    }
}