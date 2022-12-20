package org.museframework.bian.fraudresolution.dto;

public class RetrieveCaseAnalysisRequest {
    private String fraudresolutionid;

    private String caseanalysisid;

    public void setFraudresolutionid(String fraudresolutionid) {
        this.fraudresolutionid = fraudresolutionid;
    }

    public String getFraudresolutionid() {
        return fraudresolutionid;
    }

    public void setCaseanalysisid(String caseanalysisid) {
        this.caseanalysisid = caseanalysisid;
    }

    public String getCaseanalysisid() {
        return caseanalysisid;
    }
}