/*The product features/services available with a financical facility*/
package org.museframework.bian.casmanandaccser.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Interest {
    /*Applicable rate type*/
    @MetaField
    private String interestRateType;

    /*The processing schedule for applying interest rates to the account*/
    @MetaField
    private String interestRateApplicationSchedule;

    /*The collection of applicable rates*/
    @MetaField
    private String interestRateConfiguration;

    /*The rate value to be applied*/
    @MetaField
    private String interestRate;

    /*The record of applied interest*/
    @MetaField
    private String interestApplicationRecord;

    /*A record of applied interest*/
    @MetaField
    private String interestTransaction;

    /*General description of the interest transaction*/
    @MetaField
    private String transactionDescription;

    /*Applicable rate type*/
    @MetaField
    private String transactionRateType;

    /*The derived interest amount to be applied*/
    @MetaField
    private String transactionInterestCharge;

    /*Record of accrued interest*/
    @MetaField
    private String interestAccrualAmount;

    /*The interest type being tracked*/
    @MetaField
    private String interestAccrualType;

    /*The accrued amount of applied interest*/
    @MetaField
    private String interestAccrualCharge;

    public void setInterestRateType(String interestRateType) {
        this.interestRateType = interestRateType;
    }

    public String getInterestRateType() {
        return interestRateType;
    }

    public void setInterestRateApplicationSchedule(String interestRateApplicationSchedule) {
        this.interestRateApplicationSchedule = interestRateApplicationSchedule;
    }

    public String getInterestRateApplicationSchedule() {
        return interestRateApplicationSchedule;
    }

    public void setInterestRateConfiguration(String interestRateConfiguration) {
        this.interestRateConfiguration = interestRateConfiguration;
    }

    public String getInterestRateConfiguration() {
        return interestRateConfiguration;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getInterestRate() {
        return interestRate;
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

    public void setInterestAccrualAmount(String interestAccrualAmount) {
        this.interestAccrualAmount = interestAccrualAmount;
    }

    public String getInterestAccrualAmount() {
        return interestAccrualAmount;
    }

    public void setInterestAccrualType(String interestAccrualType) {
        this.interestAccrualType = interestAccrualType;
    }

    public String getInterestAccrualType() {
        return interestAccrualType;
    }

    public void setInterestAccrualCharge(String interestAccrualCharge) {
        this.interestAccrualCharge = interestAccrualCharge;
    }

    public String getInterestAccrualCharge() {
        return interestAccrualCharge;
    }
}