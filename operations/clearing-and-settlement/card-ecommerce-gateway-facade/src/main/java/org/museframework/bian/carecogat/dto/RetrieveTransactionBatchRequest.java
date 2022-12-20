package org.museframework.bian.carecogat.dto;

public class RetrieveTransactionBatchRequest {
    private String cardecommercegatewayid;

    private String transactionbatchid;

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
}