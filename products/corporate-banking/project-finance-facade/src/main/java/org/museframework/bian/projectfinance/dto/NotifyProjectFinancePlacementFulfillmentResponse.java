package org.museframework.bian.projectfinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyProjectFinancePlacementFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.projectfinance.dto.bq.ProjectFinancePlacementFulfillment projectFinancePlacementFulfillment;

    public void setProjectFinancePlacementFulfillment(org.museframework.bian.projectfinance.dto.bq.ProjectFinancePlacementFulfillment projectFinancePlacementFulfillment) {
        this.projectFinancePlacementFulfillment = projectFinancePlacementFulfillment;
    }

    public org.museframework.bian.projectfinance.dto.bq.ProjectFinancePlacementFulfillment getProjectFinancePlacementFulfillment() {
        return projectFinancePlacementFulfillment;
    }
}