package org.museframework.bian.projectfinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeProjectFinanceRepaymentFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.projectfinance.dto.bq.ProjectFinanceRepaymentFulfillment projectFinanceRepaymentFulfillment;

    public void setProjectFinanceRepaymentFulfillment(org.museframework.bian.projectfinance.dto.bq.ProjectFinanceRepaymentFulfillment projectFinanceRepaymentFulfillment) {
        this.projectFinanceRepaymentFulfillment = projectFinanceRepaymentFulfillment;
    }

    public org.museframework.bian.projectfinance.dto.bq.ProjectFinanceRepaymentFulfillment getProjectFinanceRepaymentFulfillment() {
        return projectFinanceRepaymentFulfillment;
    }
}