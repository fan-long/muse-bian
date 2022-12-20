package org.museframework.bian.productdeployment.dto;

public class RetrieveSalesandMarketingResponse {
    private org.museframework.bian.productdeployment.dto.bq.SalesandMarketing salesandMarketing;

    public void setSalesandMarketing(org.museframework.bian.productdeployment.dto.bq.SalesandMarketing salesandMarketing) {
        this.salesandMarketing = salesandMarketing;
    }

    public org.museframework.bian.productdeployment.dto.bq.SalesandMarketing getSalesandMarketing() {
        return salesandMarketing;
    }
}