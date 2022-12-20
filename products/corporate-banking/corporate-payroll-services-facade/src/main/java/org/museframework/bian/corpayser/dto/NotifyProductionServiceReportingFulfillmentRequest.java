package org.museframework.bian.corpayser.dto;

public class NotifyProductionServiceReportingFulfillmentRequest {
    private String corporatepayrollservicesid;

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