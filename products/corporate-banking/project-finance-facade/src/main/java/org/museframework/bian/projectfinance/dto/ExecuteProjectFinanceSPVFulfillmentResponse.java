package org.museframework.bian.projectfinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteProjectFinanceSPVFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.projectfinance.dto.bq.ProjectFinanceSPVFulfillment projectFinanceSPVFulfillment;

    public void setProjectFinanceSPVFulfillment(org.museframework.bian.projectfinance.dto.bq.ProjectFinanceSPVFulfillment projectFinanceSPVFulfillment) {
        this.projectFinanceSPVFulfillment = projectFinanceSPVFulfillment;
    }

    public org.museframework.bian.projectfinance.dto.bq.ProjectFinanceSPVFulfillment getProjectFinanceSPVFulfillment() {
        return projectFinanceSPVFulfillment;
    }
}