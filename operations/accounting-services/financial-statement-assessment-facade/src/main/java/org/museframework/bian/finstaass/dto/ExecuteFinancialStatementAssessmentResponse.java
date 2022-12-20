package org.museframework.bian.finstaass.dto;

public class ExecuteFinancialStatementAssessmentResponse {
    private org.museframework.bian.finstaass.dto.cr.FinancialStatementAssessment financialStatementAssessment;

    public void setFinancialStatementAssessment(org.museframework.bian.finstaass.dto.cr.FinancialStatementAssessment financialStatementAssessment) {
        this.financialStatementAssessment = financialStatementAssessment;
    }

    public org.museframework.bian.finstaass.dto.cr.FinancialStatementAssessment getFinancialStatementAssessment() {
        return financialStatementAssessment;
    }
}