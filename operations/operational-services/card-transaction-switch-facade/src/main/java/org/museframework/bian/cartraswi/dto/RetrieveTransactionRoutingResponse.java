package org.museframework.bian.cartraswi.dto;

public class RetrieveTransactionRoutingResponse {
    private org.museframework.bian.cartraswi.dto.bq.TransactionRouting transactionRouting;

    public void setTransactionRouting(org.museframework.bian.cartraswi.dto.bq.TransactionRouting transactionRouting) {
        this.transactionRouting = transactionRouting;
    }

    public org.museframework.bian.cartraswi.dto.bq.TransactionRouting getTransactionRouting() {
        return transactionRouting;
    }
}