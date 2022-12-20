package org.museframework.bian.brandmanagement.dto;

public class RetrieveBrandAdviceRequest {
    private String brandmanagementid;

    private String brandadviceid;

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
}