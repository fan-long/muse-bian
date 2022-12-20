package org.museframework.bian.cardcapture.dto;

public class ExecuteTransactionConsolidationResponse {
    private org.museframework.bian.cardcapture.dto.bq.TransactionConsolidation transactionConsolidation;

    public void setTransactionConsolidation(org.museframework.bian.cardcapture.dto.bq.TransactionConsolidation transactionConsolidation) {
        this.transactionConsolidation = transactionConsolidation;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionConsolidation getTransactionConsolidation() {
        return transactionConsolidation;
    }
}