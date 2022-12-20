package org.museframework.bian.productdirectory.dto;

public class UpdateSalesandMarketingRequest {
    private String productdirectoryid;

    private String salesandmarketingid;

    private org.museframework.bian.productdirectory.dto.bq.SalesandMarketing salesandMarketing;

    public void setProductdirectoryid(String productdirectoryid) {
        this.productdirectoryid = productdirectoryid;
    }

    public String getProductdirectoryid() {
        return productdirectoryid;
    }

    public void setSalesandmarketingid(String salesandmarketingid) {
        this.salesandmarketingid = salesandmarketingid;
    }

    public String getSalesandmarketingid() {
        return salesandmarketingid;
    }

    public void setSalesandMarketing(org.museframework.bian.productdirectory.dto.bq.SalesandMarketing salesandMarketing) {
        this.salesandMarketing = salesandMarketing;
    }

    public org.museframework.bian.productdirectory.dto.bq.SalesandMarketing getSalesandMarketing() {
        return salesandMarketing;
    }
}