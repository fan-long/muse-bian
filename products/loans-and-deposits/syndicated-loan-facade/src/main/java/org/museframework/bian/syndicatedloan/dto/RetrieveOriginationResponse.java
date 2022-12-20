package org.museframework.bian.syndicatedloan.dto;

public class RetrieveOriginationResponse {
    private org.museframework.bian.syndicatedloan.dto.bq.Origination origination;

    public void setOrigination(org.museframework.bian.syndicatedloan.dto.bq.Origination origination) {
        this.origination = origination;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.Origination getOrigination() {
        return origination;
    }
}