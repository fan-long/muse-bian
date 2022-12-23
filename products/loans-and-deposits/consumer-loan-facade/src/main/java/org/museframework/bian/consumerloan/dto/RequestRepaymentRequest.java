package org.museframework.bian.consumerloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestRepaymentRequest {
    @MetaField
    private String consumerloanid;

    @MetaField
    private String repaymentid;

    @MetaField(ref=true)
    private org.museframework.bian.consumerloan.dto.bq.Repayment repayment;

    public void setConsumerloanid(String consumerloanid) {
        this.consumerloanid = consumerloanid;
    }

    public String getConsumerloanid() {
        return consumerloanid;
    }

    public void setRepaymentid(String repaymentid) {
        this.repaymentid = repaymentid;
    }

    public String getRepaymentid() {
        return repaymentid;
    }

    public void setRepayment(org.museframework.bian.consumerloan.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.consumerloan.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}