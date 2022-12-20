package org.museframework.bian.fraudresolution.dto;

public class RequestCaseResolutionResponse {
    private org.museframework.bian.fraudresolution.dto.bq.CaseResolution caseResolution;

    public void setCaseResolution(org.museframework.bian.fraudresolution.dto.bq.CaseResolution caseResolution) {
        this.caseResolution = caseResolution;
    }

    public org.museframework.bian.fraudresolution.dto.bq.CaseResolution getCaseResolution() {
        return caseResolution;
    }
}