package org.museframework.bian.proquaass.dto;

public class RetrieveResiliencyandPerformanceChecksRequest {
    private String productqualityassuranceid;

    private String resiliencyandperformancechecksid;

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
}