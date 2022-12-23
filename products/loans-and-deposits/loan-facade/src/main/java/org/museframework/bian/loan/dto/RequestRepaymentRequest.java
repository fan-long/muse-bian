package org.museframework.bian.loan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestRepaymentRequest {
    @MetaField
    private String loanid;

    @MetaField
    private String repaymentid;

    @MetaField(ref=true)
    private org.museframework.bian.loan.dto.bq.Repayment repayment;

    public void setLoanid(String loanid) {
        this.loanid = loanid;
    }

    public String getLoanid() {
        return loanid;
    }

    public void setRepaymentid(String repaymentid) {
        this.repaymentid = repaymentid;
    }

    public String getRepaymentid() {
        return repaymentid;
    }

    public void setRepayment(org.museframework.bian.loan.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.loan.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}