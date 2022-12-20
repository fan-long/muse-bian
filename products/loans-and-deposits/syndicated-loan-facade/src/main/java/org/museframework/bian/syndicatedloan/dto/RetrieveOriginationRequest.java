package org.museframework.bian.syndicatedloan.dto;

public class RetrieveOriginationRequest {
    private String syndicatedloanid;

    private String originationid;

    public void setSyndicatedloanid(String syndicatedloanid) {
        this.syndicatedloanid = syndicatedloanid;
    }

    public String getSyndicatedloanid() {
        return syndicatedloanid;
    }

    public void setOriginationid(String originationid) {
        this.originationid = originationid;
    }

    public String getOriginationid() {
        return originationid;
    }
}