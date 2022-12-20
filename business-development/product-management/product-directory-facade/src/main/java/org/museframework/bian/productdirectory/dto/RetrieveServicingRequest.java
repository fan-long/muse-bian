package org.museframework.bian.productdirectory.dto;

public class RetrieveServicingRequest {
    private String productdirectoryid;

    private String servicingid;

    public void setProductdirectoryid(String productdirectoryid) {
        this.productdirectoryid = productdirectoryid;
    }

    public String getProductdirectoryid() {
        return productdirectoryid;
    }

    public void setServicingid(String servicingid) {
        this.servicingid = servicingid;
    }

    public String getServicingid() {
        return servicingid;
    }
}