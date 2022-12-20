package org.museframework.bian.carecogat.dto;

public class UpdateTransactionBatchRequest {
    private String cardecommercegatewayid;

    private String transactionbatchid;

    private org.museframework.bian.carecogat.dto.bq.TransactionBatch transactionBatch;

    public void setCardecommercegatewayid(String cardecommercegatewayid) {
        this.cardecommercegatewayid = cardecommercegatewayid;
    }

    public String getCardecommercegatewayid() {
        return cardecommercegatewayid;
    }

    public void setTransactionbatchid(String transactionbatchid) {
        this.transactionbatchid = transactionbatchid;
    }

    public String getTransactionbatchid() {
        return transactionbatchid;
    }

    public void setTransactionBatch(org.museframework.bian.carecogat.dto.bq.TransactionBatch transactionBatch) {
        this.transactionBatch = transactionBatch;
    }

    public org.museframework.bian.carecogat.dto.bq.TransactionBatch getTransactionBatch() {
        return transactionBatch;
    }
}