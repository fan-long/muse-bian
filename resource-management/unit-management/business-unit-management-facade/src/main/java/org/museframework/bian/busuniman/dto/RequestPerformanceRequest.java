package org.museframework.bian.busuniman.dto;

public class RequestPerformanceRequest {
    private String businessunitmanagementid;

    private String performanceid;

    private org.museframework.bian.busuniman.dto.bq.Performance performance;

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

    public void setPerformance(org.museframework.bian.busuniman.dto.bq.Performance performance) {
        this.performance = performance;
    }

    public org.museframework.bian.busuniman.dto.bq.Performance getPerformance() {
        return performance;
    }
}