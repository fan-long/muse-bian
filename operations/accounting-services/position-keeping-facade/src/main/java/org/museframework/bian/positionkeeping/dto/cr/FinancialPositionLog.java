/*Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Position Keeping. */
package org.museframework.bian.positionkeeping.dto.cr;

public class FinancialPositionLog {
    /*The type of financial transaction log (e.g. customer transactions)*/
    private String transactionLogType;

    /*The product/service for which this is a financial transaction log*/
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Reference to the product or service account holder/customer for the log if appropriate*/
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to a counterparty for the log if appropriate (e.g. merchant reference, card network reference)*/
    private org.museframework.bian.classes.Object counterpartyReference;

    /*The currency for the logged  transactions*/
    private String baseCurrency;

    /*The record of applied interest if interest calculations are supported*/
    private String interestApplicationRecord;

    /*A record of applied interest*/
    private String interestTransaction;

    /*General description of the interest transaction*/
    private String transactionDescription;

    /*Applicable rate type*/
    private String transactionRateType;

    /*The derived interest amount to be applied*/
    private String transactionInterestCharge;

    /*Basic position limits that are maintained as an aspect of the log*/
    private String managedPositionLimits;

    /*The type of position maintained for the log (e.g. cumulative balance)*/
    private String positionLimitType;

    /*The position definition, associated limit settings and rules*/
    private String positionLimitSettings;

    /*The current calculated position*/
    private String positionLimitValue;

    /*Support for recording blocks on the log position (handling is by the associated fulfillment service domain)*/
    private String amountBlock;

    /*The type of block applied to the tracked position (e.g. pending, final)*/
    private String amountBlockType;

    /*Priority classification for the block*/
    private String priority;

    /*The amount of the block*/
    private String amount;

    /*The type of key dates associated with the block  (e.g. start, expiry)*/
    private String dateType;

    /*Value of the specific date type*/
    private String date;

    /*The date and time the log was initiated. Note the log will have a complex internal calendar structure for extract and reporting*/
    private String initiationDate;

    /*The status of the log entry (e.g. active, in-suspense etc.)*/
    private String status;

    public void setTransactionLogType(String transactionLogType) {
        this.transactionLogType = transactionLogType;
    }

    public String getTransactionLogType() {
        return transactionLogType;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCounterpartyReference(org.museframework.bian.classes.Object counterpartyReference) {
        this.counterpartyReference = counterpartyReference;
    }

    public org.museframework.bian.classes.Object getCounterpartyReference() {
        return counterpartyReference;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setInterestApplicationRecord(String interestApplicationRecord) {
        this.interestApplicationRecord = interestApplicationRecord;
    }

    public String getInterestApplicationRecord() {
        return interestApplicationRecord;
    }

    public void setInterestTransaction(String interestTransaction) {
        this.interestTransaction = interestTransaction;
    }

    public String getInterestTransaction() {
        return interestTransaction;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionRateType(String transactionRateType) {
        this.transactionRateType = transactionRateType;
    }

    public String getTransactionRateType() {
        return transactionRateType;
    }

    public void setTransactionInterestCharge(String transactionInterestCharge) {
        this.transactionInterestCharge = transactionInterestCharge;
    }

    public String getTransactionInterestCharge() {
        return transactionInterestCharge;
    }

    public void setManagedPositionLimits(String managedPositionLimits) {
        this.managedPositionLimits = managedPositionLimits;
    }

    public String getManagedPositionLimits() {
        return managedPositionLimits;
    }

    public void setPositionLimitType(String positionLimitType) {
        this.positionLimitType = positionLimitType;
    }

    public String getPositionLimitType() {
        return positionLimitType;
    }

    public void setPositionLimitSettings(String positionLimitSettings) {
        this.positionLimitSettings = positionLimitSettings;
    }

    public String getPositionLimitSettings() {
        return positionLimitSettings;
    }

    public void setPositionLimitValue(String positionLimitValue) {
        this.positionLimitValue = positionLimitValue;
    }

    public String getPositionLimitValue() {
        return positionLimitValue;
    }

    public void setAmountBlock(String amountBlock) {
        this.amountBlock = amountBlock;
    }

    public String getAmountBlock() {
        return amountBlock;
    }

    public void setAmountBlockType(String amountBlockType) {
        this.amountBlockType = amountBlockType;
    }

    public String getAmountBlockType() {
        return amountBlockType;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setInitiationDate(String initiationDate) {
        this.initiationDate = initiationDate;
    }

    public String getInitiationDate() {
        return initiationDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}