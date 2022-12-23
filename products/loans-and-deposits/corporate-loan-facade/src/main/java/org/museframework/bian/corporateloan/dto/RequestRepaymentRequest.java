package org.museframework.bian.corporateloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestRepaymentRequest {
    @MetaField
    private String corporateloanid;

    @MetaField
    private String repaymentid;

    @MetaField(ref=true)
    private org.museframework.bian.corporateloan.dto.bq.Repayment repayment;

    public void setCorporateloanid(String corporateloanid) {
        this.corporateloanid = corporateloanid;
    }

    public String getCorporateloanid() {
        return corporateloanid;
    }

    public void setRepaymentid(String repaymentid) {
        this.repaymentid = repaymentid;
    }

    public String getRepaymentid() {
        return repaymentid;
    }

    public void setRepayment(org.museframework.bian.corporateloan.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.corporateloan.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}