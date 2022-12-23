package org.museframework.bian.corpayser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestProductionServiceReportingFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corpayser.dto.bq.ProductionServiceReportingFulfillment productionServiceReportingFulfillment;

    public void setProductionServiceReportingFulfillment(org.museframework.bian.corpayser.dto.bq.ProductionServiceReportingFulfillment productionServiceReportingFulfillment) {
        this.productionServiceReportingFulfillment = productionServiceReportingFulfillment;
    }

    public org.museframework.bian.corpayser.dto.bq.ProductionServiceReportingFulfillment getProductionServiceReportingFulfillment() {
        return productionServiceReportingFulfillment;
    }
}