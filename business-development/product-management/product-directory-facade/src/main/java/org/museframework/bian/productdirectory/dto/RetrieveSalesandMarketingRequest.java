package org.museframework.bian.productdirectory.dto;

public class RetrieveSalesandMarketingRequest {
    private String productdirectoryid;

    private String salesandmarketingid;

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
}