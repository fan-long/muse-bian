package org.museframework.bian.finstaass.dto;

public class EvaluateRiskTestRequest {
    private String financialstatementassessmentid;

    private String risktestid;

    private org.museframework.bian.finstaass.dto.bq.RiskTest riskTest;

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

    public void setRiskTest(org.museframework.bian.finstaass.dto.bq.RiskTest riskTest) {
        this.riskTest = riskTest;
    }

    public org.museframework.bian.finstaass.dto.bq.RiskTest getRiskTest() {
        return riskTest;
    }
}