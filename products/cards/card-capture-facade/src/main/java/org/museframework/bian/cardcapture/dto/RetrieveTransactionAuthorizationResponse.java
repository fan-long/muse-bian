package org.museframework.bian.cardcapture.dto;

public class RetrieveTransactionAuthorizationResponse {
    private org.museframework.bian.cardcapture.dto.bq.TransactionAuthorization transactionAuthorization;

    public void setTransactionAuthorization(org.museframework.bian.cardcapture.dto.bq.TransactionAuthorization transactionAuthorization) {
        this.transactionAuthorization = transactionAuthorization;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionAuthorization getTransactionAuthorization() {
        return transactionAuthorization;
    }
}