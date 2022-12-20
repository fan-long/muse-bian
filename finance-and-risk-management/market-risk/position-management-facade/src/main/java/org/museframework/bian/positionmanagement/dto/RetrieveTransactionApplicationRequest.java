package org.museframework.bian.positionmanagement.dto;

public class RetrieveTransactionApplicationRequest {
    private String positionmanagementid;

    private String transactionapplicationid;

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
}