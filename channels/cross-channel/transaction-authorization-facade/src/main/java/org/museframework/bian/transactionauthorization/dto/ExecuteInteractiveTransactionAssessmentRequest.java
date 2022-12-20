package org.museframework.bian.transactionauthorization.dto;

public class ExecuteInteractiveTransactionAssessmentRequest {
    private String transactionauthorizationid;

    private org.museframework.bian.transactionauthorization.dto.cr.InteractiveTransactionAssessment interactiveTransactionAssessment;

    public void setTransactionauthorizationid(String transactionauthorizationid) {
        this.transactionauthorizationid = transactionauthorizationid;
    }

    public String getTransactionauthorizationid() {
        return transactionauthorizationid;
    }

    public void setInteractiveTransactionAssessment(org.museframework.bian.transactionauthorization.dto.cr.InteractiveTransactionAssessment interactiveTransactionAssessment) {
        this.interactiveTransactionAssessment = interactiveTransactionAssessment;
    }

    public org.museframework.bian.transactionauthorization.dto.cr.InteractiveTransactionAssessment getInteractiveTransactionAssessment() {
        return interactiveTransactionAssessment;
    }
}