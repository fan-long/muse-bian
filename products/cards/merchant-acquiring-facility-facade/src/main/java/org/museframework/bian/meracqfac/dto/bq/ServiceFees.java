/*The product features/services available with a financical facility*/
package org.museframework.bian.meracqfac.dto.bq;

public class ServiceFees {
    /*The profile of applicable fees and penalties*/
    private String merchantFeeConfigurationProfile;

    /*The fee or penalty type applied*/
    private String merchantFeeType;

    /*Definition of the fee or penalty including when and how to apply*/
    private String merchantFeeDefinition;

    /*The record of applied fees and penalties including transactions and accrued amounts*/
    private String merchantFeeApplicationRecord;

    /*A record of an applied fee or penalty*/
    private String merchantFeeTransaction;

    /*General description of the fee or penalty transaction*/
    private String transactionDescription;

    /*The fee or penalty type applied*/
    private String transactionFeeType;

    /*The derived fee or penalty amount applied*/
    private String transactionFeeCharge;

    /*A record of projected fees and penalties*/
    private String merchantFeeProjectionsandCommitments;

    /*General description of the projected fee or penalty*/
    private String projectedTransactionDescription;

    /*The fee or penalty type*/
    private String projectedTransactionFeeType;

    /*The anticipated fee or penalty amount*/
    private String projectedTransactionFeeCharge;

    public void setMerchantFeeConfigurationProfile(String merchantFeeConfigurationProfile) {
        this.merchantFeeConfigurationProfile = merchantFeeConfigurationProfile;
    }

    public String getMerchantFeeConfigurationProfile() {
        return merchantFeeConfigurationProfile;
    }

    public void setMerchantFeeType(String merchantFeeType) {
        this.merchantFeeType = merchantFeeType;
    }

    public String getMerchantFeeType() {
        return merchantFeeType;
    }

    public void setMerchantFeeDefinition(String merchantFeeDefinition) {
        this.merchantFeeDefinition = merchantFeeDefinition;
    }

    public String getMerchantFeeDefinition() {
        return merchantFeeDefinition;
    }

    public void setMerchantFeeApplicationRecord(String merchantFeeApplicationRecord) {
        this.merchantFeeApplicationRecord = merchantFeeApplicationRecord;
    }

    public String getMerchantFeeApplicationRecord() {
        return merchantFeeApplicationRecord;
    }

    public void setMerchantFeeTransaction(String merchantFeeTransaction) {
        this.merchantFeeTransaction = merchantFeeTransaction;
    }

    public String getMerchantFeeTransaction() {
        return merchantFeeTransaction;
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

    public void setMerchantFeeProjectionsandCommitments(String merchantFeeProjectionsandCommitments) {
        this.merchantFeeProjectionsandCommitments = merchantFeeProjectionsandCommitments;
    }

    public String getMerchantFeeProjectionsandCommitments() {
        return merchantFeeProjectionsandCommitments;
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
}