package org.museframework.bian.positionmanagement.dto;

public class UpdateTrialTransactionResponse {
    private org.museframework.bian.positionmanagement.dto.bq.TrialTransaction trialTransaction;

    public void setTrialTransaction(org.museframework.bian.positionmanagement.dto.bq.TrialTransaction trialTransaction) {
        this.trialTransaction = trialTransaction;
    }

    public org.museframework.bian.positionmanagement.dto.bq.TrialTransaction getTrialTransaction() {
        return trialTransaction;
    }
}