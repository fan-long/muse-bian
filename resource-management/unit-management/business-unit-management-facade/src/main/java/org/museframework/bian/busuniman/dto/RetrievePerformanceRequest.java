package org.museframework.bian.busuniman.dto;

public class RetrievePerformanceRequest {
    private String businessunitmanagementid;

    private String performanceid;

    public void setBusinessunitmanagementid(String businessunitmanagementid) {
        this.businessunitmanagementid = businessunitmanagementid;
    }

    public String getBusinessunitmanagementid() {
        return businessunitmanagementid;
    }

    public void setPerformanceid(String performanceid) {
        this.performanceid = performanceid;
    }

    public String getPerformanceid() {
        return performanceid;
    }
}