package org.museframework.bian.fraudresolution.dto;

public class RetrieveCaseAnalysisResponse {
    private org.museframework.bian.fraudresolution.dto.bq.CaseAnalysis caseAnalysis;

    public void setCaseAnalysis(org.museframework.bian.fraudresolution.dto.bq.CaseAnalysis caseAnalysis) {
        this.caseAnalysis = caseAnalysis;
    }

    public org.museframework.bian.fraudresolution.dto.bq.CaseAnalysis getCaseAnalysis() {
        return caseAnalysis;
    }
}