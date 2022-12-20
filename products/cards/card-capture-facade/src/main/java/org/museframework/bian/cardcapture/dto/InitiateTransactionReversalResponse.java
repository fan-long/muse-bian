package org.museframework.bian.cardcapture.dto;

public class InitiateTransactionReversalResponse {
    private org.museframework.bian.cardcapture.dto.bq.TransactionReversal transactionReversal;

    public void setTransactionReversal(org.museframework.bian.cardcapture.dto.bq.TransactionReversal transactionReversal) {
        this.transactionReversal = transactionReversal;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionReversal getTransactionReversal() {
        return transactionReversal;
    }
}