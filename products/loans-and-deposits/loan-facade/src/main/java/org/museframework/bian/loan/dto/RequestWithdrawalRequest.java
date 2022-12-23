package org.museframework.bian.loan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestWithdrawalRequest {
    @MetaField
    private String loanid;

    @MetaField
    private String withdrawalid;

    @MetaField(ref=true)
    private org.museframework.bian.loan.dto.bq.Withdrawal withdrawal;

    public void setLoanid(String loanid) {
        this.loanid = loanid;
    }

    public String getLoanid() {
        return loanid;
    }

    public void setWithdrawalid(String withdrawalid) {
        this.withdrawalid = withdrawalid;
    }

    public String getWithdrawalid() {
        return withdrawalid;
    }

    public void setWithdrawal(org.museframework.bian.loan.dto.bq.Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public org.museframework.bian.loan.dto.bq.Withdrawal getWithdrawal() {
        return withdrawal;
    }
}