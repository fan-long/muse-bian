package org.museframework.bian.concenman.dto;

public class UpdatePerformanceRequest {
    private String contactcentermanagementid;

    private String performanceid;

    private org.museframework.bian.concenman.dto.bq.Performance performance;

    public void setContactcentermanagementid(String contactcentermanagementid) {
        this.contactcentermanagementid = contactcentermanagementid;
    }

    public String getContactcentermanagementid() {
        return contactcentermanagementid;
    }

    public void setPerformanceid(String performanceid) {
        this.performanceid = performanceid;
    }

    public String getPerformanceid() {
        return performanceid;
    }

    public void setPerformance(org.museframework.bian.concenman.dto.bq.Performance performance) {
        this.performance = performance;
    }

    public org.museframework.bian.concenman.dto.bq.Performance getPerformance() {
        return performance;
    }
}