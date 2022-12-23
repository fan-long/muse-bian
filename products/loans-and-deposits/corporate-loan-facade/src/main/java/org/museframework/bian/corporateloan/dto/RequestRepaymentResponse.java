package org.museframework.bian.corporateloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestRepaymentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporateloan.dto.bq.Repayment repayment;

    public void setRepayment(org.museframework.bian.corporateloan.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.corporateloan.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}