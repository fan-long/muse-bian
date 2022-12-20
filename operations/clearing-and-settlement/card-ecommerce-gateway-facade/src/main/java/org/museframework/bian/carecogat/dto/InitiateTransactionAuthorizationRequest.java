package org.museframework.bian.carecogat.dto;

public class InitiateTransactionAuthorizationRequest {
    private String cardecommercegatewayid;

    private String transactionauthorizationid;

    private org.museframework.bian.carecogat.dto.bq.TransactionAuthorization transactionAuthorization;

    public void setCardecommercegatewayid(String cardecommercegatewayid) {
        this.cardecommercegatewayid = cardecommercegatewayid;
    }

    public String getCardecommercegatewayid() {
        return cardecommercegatewayid;
    }

    public void setTransactionauthorizationid(String transactionauthorizationid) {
        this.transactionauthorizationid = transactionauthorizationid;
    }

    public String getTransactionauthorizationid() {
        return transactionauthorizationid;
    }

    public void setTransactionAuthorization(org.museframework.bian.carecogat.dto.bq.TransactionAuthorization transactionAuthorization) {
        this.transactionAuthorization = transactionAuthorization;
    }

    public org.museframework.bian.carecogat.dto.bq.TransactionAuthorization getTransactionAuthorization() {
        return transactionAuthorization;
    }
}