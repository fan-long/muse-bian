/*The product features/services available with a financical facility*/
package org.museframework.bian.conadvser.dto.bq;

public class ServiceFees {
    /*The record of applied fees for the specialist advice*/
    private String feeApplicationRecord;

    /*A record of an applied fee*/
    private String feeTransaction;

    /*General description of the fee*/
    private String feeTransactionDescription;

    /*The fee type applied*/
    private String feeTransactionType;

    /*The derived fee amount to be charged*/
    private String feeTransactionCharge;

    public void setFeeApplicationRecord(String feeApplicationRecord) {
        this.feeApplicationRecord = feeApplicationRecord;
    }

    public String getFeeApplicationRecord() {
        return feeApplicationRecord;
    }

    public void setFeeTransaction(String feeTransaction) {
        this.feeTransaction = feeTransaction;
    }

    public String getFeeTransaction() {
        return feeTransaction;
    }

    public void setFeeTransactionDescription(String feeTransactionDescription) {
        this.feeTransactionDescription = feeTransactionDescription;
    }

    public String getFeeTransactionDescription() {
        return feeTransactionDescription;
    }

    public void setFeeTransactionType(String feeTransactionType) {
        this.feeTransactionType = feeTransactionType;
    }

    public String getFeeTransactionType() {
        return feeTransactionType;
    }

    public void setFeeTransactionCharge(String feeTransactionCharge) {
        this.feeTransactionCharge = feeTransactionCharge;
    }

    public String getFeeTransactionCharge() {
        return feeTransactionCharge;
    }
}