package org.museframework.bian.carecogat.dto;

public class InitiateTransactionAuthorizationResponse {
    private org.museframework.bian.carecogat.dto.bq.TransactionAuthorization transactionAuthorization;

    public void setTransactionAuthorization(org.museframework.bian.carecogat.dto.bq.TransactionAuthorization transactionAuthorization) {
        this.transactionAuthorization = transactionAuthorization;
    }

    public org.museframework.bian.carecogat.dto.bq.TransactionAuthorization getTransactionAuthorization() {
        return transactionAuthorization;
    }
}