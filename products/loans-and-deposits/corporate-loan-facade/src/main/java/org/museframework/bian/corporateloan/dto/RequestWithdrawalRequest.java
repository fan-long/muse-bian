package org.museframework.bian.corporateloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestWithdrawalRequest {
    @MetaField
    private String corporateloanid;

    @MetaField
    private String withdrawalid;

    @MetaField(ref=true)
    private org.museframework.bian.corporateloan.dto.bq.Withdrawal withdrawal;

    public void setCorporateloanid(String corporateloanid) {
        this.corporateloanid = corporateloanid;
    }

    public String getCorporateloanid() {
        return corporateloanid;
    }

    public void setWithdrawalid(String withdrawalid) {
        this.withdrawalid = withdrawalid;
    }

    public String getWithdrawalid() {
        return withdrawalid;
    }

    public void setWithdrawal(org.museframework.bian.corporateloan.dto.bq.Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public org.museframework.bian.corporateloan.dto.bq.Withdrawal getWithdrawal() {
        return withdrawal;
    }
}