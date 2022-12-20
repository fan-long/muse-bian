package org.museframework.bian.fraudresolution.dto;

public class RetrieveCaseResolutionRequest {
    private String fraudresolutionid;

    private String caseresolutionid;

    public void setFraudresolutionid(String fraudresolutionid) {
        this.fraudresolutionid = fraudresolutionid;
    }

    public String getFraudresolutionid() {
        return fraudresolutionid;
    }

    public void setCaseresolutionid(String caseresolutionid) {
        this.caseresolutionid = caseresolutionid;
    }

    public String getCaseresolutionid() {
        return caseresolutionid;
    }
}