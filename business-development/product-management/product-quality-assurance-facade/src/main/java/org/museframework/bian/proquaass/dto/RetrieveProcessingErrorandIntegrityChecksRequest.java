package org.museframework.bian.proquaass.dto;

public class RetrieveProcessingErrorandIntegrityChecksRequest {
    private String productqualityassuranceid;

    private String processingerrorandintegritychecksid;

    public void setProductqualityassuranceid(String productqualityassuranceid) {
        this.productqualityassuranceid = productqualityassuranceid;
    }

    public String getProductqualityassuranceid() {
        return productqualityassuranceid;
    }

    public void setProcessingerrorandintegritychecksid(String processingerrorandintegritychecksid) {
        this.processingerrorandintegritychecksid = processingerrorandintegritychecksid;
    }

    public String getProcessingerrorandintegritychecksid() {
        return processingerrorandintegritychecksid;
    }
}