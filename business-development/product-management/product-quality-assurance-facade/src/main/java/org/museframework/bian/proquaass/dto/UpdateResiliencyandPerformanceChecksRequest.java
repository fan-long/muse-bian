package org.museframework.bian.proquaass.dto;

public class UpdateResiliencyandPerformanceChecksRequest {
    private String productqualityassuranceid;

    private String resiliencyandperformancechecksid;

    private org.museframework.bian.proquaass.dto.bq.ResiliencyandPerformanceChecks resiliencyandPerformanceChecks;

    public void setProductqualityassuranceid(String productqualityassuranceid) {
        this.productqualityassuranceid = productqualityassuranceid;
    }

    public String getProductqualityassuranceid() {
        return productqualityassuranceid;
    }

    public void setResiliencyandperformancechecksid(String resiliencyandperformancechecksid) {
        this.resiliencyandperformancechecksid = resiliencyandperformancechecksid;
    }

    public String getResiliencyandperformancechecksid() {
        return resiliencyandperformancechecksid;
    }

    public void setResiliencyandPerformanceChecks(org.museframework.bian.proquaass.dto.bq.ResiliencyandPerformanceChecks resiliencyandPerformanceChecks) {
        this.resiliencyandPerformanceChecks = resiliencyandPerformanceChecks;
    }

    public org.museframework.bian.proquaass.dto.bq.ResiliencyandPerformanceChecks getResiliencyandPerformanceChecks() {
        return resiliencyandPerformanceChecks;
    }
}