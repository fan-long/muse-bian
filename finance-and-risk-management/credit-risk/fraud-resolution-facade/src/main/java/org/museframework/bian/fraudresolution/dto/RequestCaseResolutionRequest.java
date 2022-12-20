package org.museframework.bian.fraudresolution.dto;

public class RequestCaseResolutionRequest {
    private String fraudresolutionid;

    private String caseresolutionid;

    private org.museframework.bian.fraudresolution.dto.bq.CaseResolution caseResolution;

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

    public void setCaseResolution(org.museframework.bian.fraudresolution.dto.bq.CaseResolution caseResolution) {
        this.caseResolution = caseResolution;
    }

    public org.museframework.bian.fraudresolution.dto.bq.CaseResolution getCaseResolution() {
        return caseResolution;
    }
}