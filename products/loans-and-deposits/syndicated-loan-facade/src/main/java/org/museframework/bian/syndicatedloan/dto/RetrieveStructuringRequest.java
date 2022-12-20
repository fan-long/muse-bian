package org.museframework.bian.syndicatedloan.dto;

public class RetrieveStructuringRequest {
    private String syndicatedloanid;

    private String structuringid;

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
}