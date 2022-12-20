/**/
package org.museframework.bian.termdeposit.dto.bq;

public class ServiceFees {
    /*The profile of applicable fees and penalties*/
    private String feeConfigurationProfile;

    /*The fee or penalty type applied*/
    private String feeType;

    /*Definition of the fee or penalty including when and how to apply*/
    private String feeDefinition;

    /*The record of applied fees and penalties including transactions and accrued amounts*/
    private String feeApplicationRecord;

    /*A record of an applied fee or penalty*/
    private String feeTransaction;

    /*General description of the fee or penalty transaction*/
    private String transactionDescription;

    /*The fee or penalty type applied*/
    private String transactionFeeType;

    /*The derived fee or penalty amount applied*/
    private String transactionFeeCharge;

    /*A record of projected fees and penalties*/
    private String feeProjectionsandCommitments;

    /*General description of the projected fee or penalty*/
    private String projectedTransactionDescription;

    /*The fee or penalty type*/
    private String projectedTransactionFeeType;

    /*The anticipated fee or penalty amount*/
    private String projectedTransactionFeeCharge;

    /*Tracking of accumulated fees and penalties*/
    private String feeAccrualAmount;

    /*The fee or penalty type being tracked*/
    private String accrualFeeType;

    /*The accrued amount of fees and penalties*/
    private String accrualFeeCharge;

    public void setFeeConfigurationProfile(String feeConfigurationProfile) {
        this.feeConfigurationProfile = feeConfigurationProfile;
    }

    public String getFeeConfigurationProfile() {
        return feeConfigurationProfile;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeDefinition(String feeDefinition) {
        this.feeDefinition = feeDefinition;
    }

    public String getFeeDefinition() {
        return feeDefinition;
    }

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

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionFeeType(String transactionFeeType) {
        this.transactionFeeType = transactionFeeType;
    }

    public String getTransactionFeeType() {
        return transactionFeeType;
    }

    public void setTransactionFeeCharge(String transactionFeeCharge) {
        this.transactionFeeCharge = transactionFeeCharge;
    }

    public String getTransactionFeeCharge() {
        return transactionFeeCharge;
    }

    public void setFeeProjectionsandCommitments(String feeProjectionsandCommitments) {
        this.feeProjectionsandCommitments = feeProjectionsandCommitments;
    }

    public String getFeeProjectionsandCommitments() {
        return feeProjectionsandCommitments;
    }

    public void setProjectedTransactionDescription(String projectedTransactionDescription) {
        this.projectedTransactionDescription = projectedTransactionDescription;
    }

    public String getProjectedTransactionDescription() {
        return projectedTransactionDescription;
    }

    public void setProjectedTransactionFeeType(String projectedTransactionFeeType) {
        this.projectedTransactionFeeType = projectedTransactionFeeType;
    }

    public String getProjectedTransactionFeeType() {
        return projectedTransactionFeeType;
    }

    public void setProjectedTransactionFeeCharge(String projectedTransactionFeeCharge) {
        this.projectedTransactionFeeCharge = projectedTransactionFeeCharge;
    }

    public String getProjectedTransactionFeeCharge() {
        return projectedTransactionFeeCharge;
    }

    public void setFeeAccrualAmount(String feeAccrualAmount) {
        this.feeAccrualAmount = feeAccrualAmount;
    }

    public String getFeeAccrualAmount() {
        return feeAccrualAmount;
    }

    public void setAccrualFeeType(String accrualFeeType) {
        this.accrualFeeType = accrualFeeType;
    }

    public String getAccrualFeeType() {
        return accrualFeeType;
    }

    public void setAccrualFeeCharge(String accrualFeeCharge) {
        this.accrualFeeCharge = accrualFeeCharge;
    }

    public String getAccrualFeeCharge() {
        return accrualFeeCharge;
    }
}