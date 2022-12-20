package org.museframework.bian.cuscasman.dto;

public class RequestPerformanceRequest {
    private String customercasemanagementid;

    private String performanceid;

    private org.museframework.bian.cuscasman.dto.bq.Performance performance;

    public void setCustomercasemanagementid(String customercasemanagementid) {
        this.customercasemanagementid = customercasemanagementid;
    }

    public String getCustomercasemanagementid() {
        return customercasemanagementid;
    }

    public void setPerformanceid(String performanceid) {
        this.performanceid = performanceid;
    }

    public String getPerformanceid() {
        return performanceid;
    }

    public void setPerformance(org.museframework.bian.cuscasman.dto.bq.Performance performance) {
        this.performance = performance;
    }

    public org.museframework.bian.cuscasman.dto.bq.Performance getPerformance() {
        return performance;
    }
}