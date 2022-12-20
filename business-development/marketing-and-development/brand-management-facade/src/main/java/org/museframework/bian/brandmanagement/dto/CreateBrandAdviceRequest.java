package org.museframework.bian.brandmanagement.dto;

public class CreateBrandAdviceRequest {
    private String brandmanagementid;

    private String brandadviceid;

    private org.museframework.bian.brandmanagement.dto.bq.BrandAdvice brandAdvice;

    public void setBrandmanagementid(String brandmanagementid) {
        this.brandmanagementid = brandmanagementid;
    }

    public String getBrandmanagementid() {
        return brandmanagementid;
    }

    public void setBrandadviceid(String brandadviceid) {
        this.brandadviceid = brandadviceid;
    }

    public String getBrandadviceid() {
        return brandadviceid;
    }

    public void setBrandAdvice(org.museframework.bian.brandmanagement.dto.bq.BrandAdvice brandAdvice) {
        this.brandAdvice = brandAdvice;
    }

    public org.museframework.bian.brandmanagement.dto.bq.BrandAdvice getBrandAdvice() {
        return brandAdvice;
    }
}