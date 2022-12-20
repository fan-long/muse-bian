package org.museframework.bian.productdirectory.dto;

public class RegisterServicingRequest {
    private String productdirectoryid;

    private String servicingid;

    private org.museframework.bian.productdirectory.dto.bq.Servicing servicing;

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

    public void setServicing(org.museframework.bian.productdirectory.dto.bq.Servicing servicing) {
        this.servicing = servicing;
    }

    public org.museframework.bian.productdirectory.dto.bq.Servicing getServicing() {
        return servicing;
    }
}