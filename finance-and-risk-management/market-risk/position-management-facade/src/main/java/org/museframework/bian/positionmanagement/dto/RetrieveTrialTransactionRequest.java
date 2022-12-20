package org.museframework.bian.positionmanagement.dto;

public class RetrieveTrialTransactionRequest {
    private String positionmanagementid;

    private String trialtransactionid;

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
}