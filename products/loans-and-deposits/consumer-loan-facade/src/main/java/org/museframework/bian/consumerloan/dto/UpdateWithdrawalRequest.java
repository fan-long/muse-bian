package org.museframework.bian.consumerloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateWithdrawalRequest {
    @MetaField
    private String consumerloanid;

    @MetaField
    private String withdrawalid;

    @MetaField(ref=true)
    private org.museframework.bian.consumerloan.dto.bq.Withdrawal withdrawal;

    public void setConsumerloanid(String consumerloanid) {
        this.consumerloanid = consumerloanid;
    }

    public String getConsumerloanid() {
        return consumerloanid;
    }

    public void setWithdrawalid(String withdrawalid) {
        this.withdrawalid = withdrawalid;
    }

    public String getWithdrawalid() {
        return withdrawalid;
    }

    public void setWithdrawal(org.museframework.bian.consumerloan.dto.bq.Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public org.museframework.bian.consumerloan.dto.bq.Withdrawal getWithdrawal() {
        return withdrawal;
    }
}