package org.museframework.bian.positionmanagement.dto;

public class UpdateTransactionApplicationRequest {
    private String positionmanagementid;

    private String transactionapplicationid;

    private org.museframework.bian.positionmanagement.dto.bq.TransactionApplication transactionApplication;

    public void setPositionmanagementid(String positionmanagementid) {
        this.positionmanagementid = positionmanagementid;
    }

    public String getPositionmanagementid() {
        return positionmanagementid;
    }

    public void setTransactionapplicationid(String transactionapplicationid) {
        this.transactionapplicationid = transactionapplicationid;
    }

    public String getTransactionapplicationid() {
        return transactionapplicationid;
    }

    public void setTransactionApplication(org.museframework.bian.positionmanagement.dto.bq.TransactionApplication transactionApplication) {
        this.transactionApplication = transactionApplication;
    }

    public org.museframework.bian.positionmanagement.dto.bq.TransactionApplication getTransactionApplication() {
        return transactionApplication;
    }
}