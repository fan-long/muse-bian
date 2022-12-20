package org.museframework.bian.proquaass.dto;

public class UpdateProcessingErrorandIntegrityChecksRequest {
    private String productqualityassuranceid;

    private String processingerrorandintegritychecksid;

    private org.museframework.bian.proquaass.dto.bq.ProcessingErrorandIntegrityChecks processingErrorandIntegrityChecks;

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

    public void setProcessingErrorandIntegrityChecks(org.museframework.bian.proquaass.dto.bq.ProcessingErrorandIntegrityChecks processingErrorandIntegrityChecks) {
        this.processingErrorandIntegrityChecks = processingErrorandIntegrityChecks;
    }

    public org.museframework.bian.proquaass.dto.bq.ProcessingErrorandIntegrityChecks getProcessingErrorandIntegrityChecks() {
        return processingErrorandIntegrityChecks;
    }
}