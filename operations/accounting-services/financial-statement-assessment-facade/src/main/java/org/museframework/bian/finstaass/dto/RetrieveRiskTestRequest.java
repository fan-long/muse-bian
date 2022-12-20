package org.museframework.bian.finstaass.dto;

public class RetrieveRiskTestRequest {
    private String financialstatementassessmentid;

    private String risktestid;

    public void setFinancialstatementassessmentid(String financialstatementassessmentid) {
        this.financialstatementassessmentid = financialstatementassessmentid;
    }

    public String getFinancialstatementassessmentid() {
        return financialstatementassessmentid;
    }

    public void setRisktestid(String risktestid) {
        this.risktestid = risktestid;
    }

    public String getRisktestid() {
        return risktestid;
    }
}