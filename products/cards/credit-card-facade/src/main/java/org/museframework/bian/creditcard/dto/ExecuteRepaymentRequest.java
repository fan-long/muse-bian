package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteRepaymentRequest {
    @MetaField
    private String creditcardid;

    @MetaField
    private String repaymentid;

    @MetaField(ref=true)
    private org.museframework.bian.creditcard.dto.bq.Repayment repayment;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setRepaymentid(String repaymentid) {
        this.repaymentid = repaymentid;
    }

    public String getRepaymentid() {
        return repaymentid;
    }

    public void setRepayment(org.museframework.bian.creditcard.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.creditcard.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}