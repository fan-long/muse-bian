/**/
package org.museframework.bian.termdeposit.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ServiceFees {
    /*The profile of applicable fees and penalties*/
    @MetaField
    private String feeConfigurationProfile;

    /*The fee or penalty type applied*/
    @MetaField
    private String feeType;

    /*Definition of the fee or penalty including when and how to apply*/
    @MetaField
    private String feeDefinition;

    /*The record of applied fees and penalties including transactions and accrued amounts*/
    @MetaField
    private String feeApplicationRecord;

    /*A record of an applied fee or penalty*/
    @MetaField
    private String feeTransaction;

    /*General description of the fee or penalty transaction*/
    @MetaField
    private String transactionDescription;

    /*The fee or penalty type applied*/
    @MetaField
    private String transactionFeeType;

    /*The derived fee or penalty amount applied*/
    @MetaField
    private String transactionFeeCharge;

    /*A record of projected fees and penalties*/
    @MetaField
    private String feeProjectionsandCommitments;

    /*General description of the projected fee or penalty*/
    @MetaField
    private String projectedTransactionDescription;

    /*The fee or penalty type*/
    @MetaField
    private String projectedTransactionFeeType;

    /*The anticipated fee or penalty amount*/
    @MetaField
    private String projectedTransactionFeeCharge;

    /*Tracking of accumulated fees and penalties*/
    @MetaField
    private String feeAccrualAmount;

    /*The fee or penalty type being tracked*/
    @MetaField
    private String accrualFeeType;

    /*The accrued amount of fees and penalties*/
    @MetaField
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