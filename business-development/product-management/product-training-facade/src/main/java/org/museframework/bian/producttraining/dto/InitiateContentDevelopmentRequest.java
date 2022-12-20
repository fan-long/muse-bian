package org.museframework.bian.producttraining.dto;

public class InitiateContentDevelopmentRequest {
    private String producttrainingid;

    private String contentdevelopmentid;

    private org.museframework.bian.producttraining.dto.bq.ContentDevelopment contentDevelopment;

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

    public void setContentDevelopment(org.museframework.bian.producttraining.dto.bq.ContentDevelopment contentDevelopment) {
        this.contentDevelopment = contentDevelopment;
    }

    public org.museframework.bian.producttraining.dto.bq.ContentDevelopment getContentDevelopment() {
        return contentDevelopment;
    }
}