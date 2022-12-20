package org.museframework.bian.carecogat.dto;

public class RetrieveTransactionBatchResponse {
    private org.museframework.bian.carecogat.dto.bq.TransactionBatch transactionBatch;

    public void setTransactionBatch(org.museframework.bian.carecogat.dto.bq.TransactionBatch transactionBatch) {
        this.transactionBatch = transactionBatch;
    }

    public org.museframework.bian.carecogat.dto.bq.TransactionBatch getTransactionBatch() {
        return transactionBatch;
    }
}