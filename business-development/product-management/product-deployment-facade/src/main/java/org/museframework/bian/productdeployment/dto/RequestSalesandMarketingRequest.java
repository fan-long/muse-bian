package org.museframework.bian.productdeployment.dto;

public class RequestSalesandMarketingRequest {
    private String productdeploymentid;

    private String salesandmarketingid;

    private org.museframework.bian.productdeployment.dto.bq.SalesandMarketing salesandMarketing;

    public void setProductdeploymentid(String productdeploymentid) {
        this.productdeploymentid = productdeploymentid;
    }

    public String getProductdeploymentid() {
        return productdeploymentid;
    }

    public void setSalesandmarketingid(String salesandmarketingid) {
        this.salesandmarketingid = salesandmarketingid;
    }

    public String getSalesandmarketingid() {
        return salesandmarketingid;
    }

    public void setSalesandMarketing(org.museframework.bian.productdeployment.dto.bq.SalesandMarketing salesandMarketing) {
        this.salesandMarketing = salesandMarketing;
    }

    public org.museframework.bian.productdeployment.dto.bq.SalesandMarketing getSalesandMarketing() {
        return salesandMarketing;
    }
}