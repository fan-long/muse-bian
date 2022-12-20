package org.museframework.bian.positionmanagement.dto;

public class UpdateTransactionApplicationResponse {
    private org.museframework.bian.positionmanagement.dto.bq.TransactionApplication transactionApplication;

    public void setTransactionApplication(org.museframework.bian.positionmanagement.dto.bq.TransactionApplication transactionApplication) {
        this.transactionApplication = transactionApplication;
    }

    public org.museframework.bian.positionmanagement.dto.bq.TransactionApplication getTransactionApplication() {
        return transactionApplication;
    }
}