package org.museframework.bian.corpayser.dto;

public class UpdateProductionServiceReportingFulfillmentRequest {
    private String corporatepayrollservicesid;

    private String productionservicereportingfulfillmentid;

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