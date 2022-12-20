package org.museframework.bian.syndicatedloan.dto;

public class ExchangeStructuringRequest {
    private String syndicatedloanid;

    private String structuringid;

    private org.museframework.bian.syndicatedloan.dto.bq.Structuring structuring;

    public void setSyndicatedloanid(String syndicatedloanid) {
        this.syndicatedloanid = syndicatedloanid;
    }

    public String getSyndicatedloanid() {
        return syndicatedloanid;
    }

    public void setStructuringid(String structuringid) {
        this.structuringid = structuringid;
    }

    public String getStructuringid() {
        return structuringid;
    }

    public void setStructuring(org.museframework.bian.syndicatedloan.dto.bq.Structuring structuring) {
        this.structuring = structuring;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.Structuring getStructuring() {
        return structuring;
    }
}