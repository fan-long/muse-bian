package org.museframework.bian.transactionauthorization.dto;

public class ExecuteInteractiveTransactionAssessmentResponse {
    private org.museframework.bian.transactionauthorization.dto.cr.InteractiveTransactionAssessment interactiveTransactionAssessment;

    public void setInteractiveTransactionAssessment(org.museframework.bian.transactionauthorization.dto.cr.InteractiveTransactionAssessment interactiveTransactionAssessment) {
        this.interactiveTransactionAssessment = interactiveTransactionAssessment;
    }

    public org.museframework.bian.transactionauthorization.dto.cr.InteractiveTransactionAssessment getInteractiveTransactionAssessment() {
        return interactiveTransactionAssessment;
    }
}