package org.museframework.bian.corpayser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteProductionServiceReportingFulfillmentRequest {
    @MetaField
    private String corporatepayrollservicesid;

    @MetaField
    private String productionservicereportingfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.corpayser.dto.bq.ProductionServiceReportingFulfillment productionServiceReportingFulfillment;

    public void setCorporatepayrollservicesid(String corporatepayrollservicesid) {
        this.corporatepayrollservicesid = corporatepayrollservicesid;
    }

    public String getCorporatepayrollservicesid() {
        return corporatepayrollservicesid;
    }

    public void setProductionservicereportingfulfillmentid(String productionservicereportingfulfillmentid) {
        this.productionservicereportingfulfillmentid = productionservicereportingfulfillmentid;
    }

    public String getProductionservicereportingfulfillmentid() {
        return productionservicereportingfulfillmentid;
    }

    public void setProductionServiceReportingFulfillment(org.museframework.bian.corpayser.dto.bq.ProductionServiceReportingFulfillment productionServiceReportingFulfillment) {
        this.productionServiceReportingFulfillment = productionServiceReportingFulfillment;
    }

    public org.museframework.bian.corpayser.dto.bq.ProductionServiceReportingFulfillment getProductionServiceReportingFulfillment() {
        return productionServiceReportingFulfillment;
    }
}