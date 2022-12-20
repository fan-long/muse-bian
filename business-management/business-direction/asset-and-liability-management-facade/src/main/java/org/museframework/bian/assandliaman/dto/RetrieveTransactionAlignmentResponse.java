package org.museframework.bian.assandliaman.dto;

public class RetrieveTransactionAlignmentResponse {
    private org.museframework.bian.assandliaman.dto.bq.TransactionAlignment transactionAlignment;

    public void setTransactionAlignment(org.museframework.bian.assandliaman.dto.bq.TransactionAlignment transactionAlignment) {
        this.transactionAlignment = transactionAlignment;
    }

    public org.museframework.bian.assandliaman.dto.bq.TransactionAlignment getTransactionAlignment() {
        return transactionAlignment;
    }
}