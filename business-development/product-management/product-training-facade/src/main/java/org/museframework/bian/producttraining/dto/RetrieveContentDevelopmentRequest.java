package org.museframework.bian.producttraining.dto;

public class RetrieveContentDevelopmentRequest {
    private String producttrainingid;

    private String contentdevelopmentid;

    public void setProducttrainingid(String producttrainingid) {
        this.producttrainingid = producttrainingid;
    }

    public String getProducttrainingid() {
        return producttrainingid;
    }

    public void setContentdevelopmentid(String contentdevelopmentid) {
        this.contentdevelopmentid = contentdevelopmentid;
    }

    public String getContentdevelopmentid() {
        return contentdevelopmentid;
    }
}