package org.museframework.bian.finstaass.dto;

public class RequestFinancialStatementAssessmentRequest {
    private String financialstatementassessmentid;

    private org.museframework.bian.finstaass.dto.cr.FinancialStatementAssessment financialStatementAssessment;

    public void setFinancialstatementassessmentid(String financialstatementassessmentid) {
        this.financialstatementassessmentid = financialstatementassessmentid;
    }

    public String getFinancialstatementassessmentid() {
        return financialstatementassessmentid;
    }

    public void setFinancialStatementAssessment(org.museframework.bian.finstaass.dto.cr.FinancialStatementAssessment financialStatementAssessment) {
        this.financialStatementAssessment = financialStatementAssessment;
    }

    public org.museframework.bian.finstaass.dto.cr.FinancialStatementAssessment getFinancialStatementAssessment() {
        return financialStatementAssessment;
    }
}