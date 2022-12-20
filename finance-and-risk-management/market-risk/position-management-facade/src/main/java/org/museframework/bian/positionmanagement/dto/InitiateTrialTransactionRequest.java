package org.museframework.bian.positionmanagement.dto;

public class InitiateTrialTransactionRequest {
    private String positionmanagementid;

    private String trialtransactionid;

    private org.museframework.bian.positionmanagement.dto.bq.TrialTransaction trialTransaction;

    public void setPositionmanagementid(String positionmanagementid) {
        this.positionmanagementid = positionmanagementid;
    }

    public String getPositionmanagementid() {
        return positionmanagementid;
    }

    public void setTrialtransactionid(String trialtransactionid) {
        this.trialtransactionid = trialtransactionid;
    }

    public String getTrialtransactionid() {
        return trialtransactionid;
    }

    public void setTrialTransaction(org.museframework.bian.positionmanagement.dto.bq.TrialTransaction trialTransaction) {
        this.trialTransaction = trialTransaction;
    }

    public org.museframework.bian.positionmanagement.dto.bq.TrialTransaction getTrialTransaction() {
        return trialTransaction;
    }
}