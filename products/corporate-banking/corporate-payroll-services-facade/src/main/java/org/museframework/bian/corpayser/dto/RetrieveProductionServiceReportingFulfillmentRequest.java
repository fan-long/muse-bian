package org.museframework.bian.corpayser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductionServiceReportingFulfillmentRequest {
    @MetaField
    private String corporatepayrollservicesid;

    @MetaField
    private String productionservicereportingfulfillmentid;

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
}