package org.museframework.bian.syndicatedloan.dto;

public class UpdateOriginationRequest {
    private String syndicatedloanid;

    private String originationid;

    private org.museframework.bian.syndicatedloan.dto.bq.Origination origination;

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

    public void setOrigination(org.museframework.bian.syndicatedloan.dto.bq.Origination origination) {
        this.origination = origination;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.Origination getOrigination() {
        return origination;
    }
}