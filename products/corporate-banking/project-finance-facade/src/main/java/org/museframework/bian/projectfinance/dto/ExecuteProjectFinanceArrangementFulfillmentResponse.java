package org.museframework.bian.projectfinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteProjectFinanceArrangementFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.projectfinance.dto.bq.ProjectFinanceArrangementFulfillment projectFinanceArrangementFulfillment;

    public void setProjectFinanceArrangementFulfillment(org.museframework.bian.projectfinance.dto.bq.ProjectFinanceArrangementFulfillment projectFinanceArrangementFulfillment) {
        this.projectFinanceArrangementFulfillment = projectFinanceArrangementFulfillment;
    }

    public org.museframework.bian.projectfinance.dto.bq.ProjectFinanceArrangementFulfillment getProjectFinanceArrangementFulfillment() {
        return projectFinanceArrangementFulfillment;
    }
}