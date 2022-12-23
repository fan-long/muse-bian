/**/
package org.museframework.bian.savingsaccount.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Payments {
    /*The type of payment transaction (e.g. customer payment, standing order, direct debit, bill pay)*/
    @MetaField
    private String paymentType;

    /*Definition of the type of payment including processing rules and guidelines*/
    @MetaField
    private String paymentDefinition;

    /*Definition of the processing option and impact (e.g. frequency and cumulative amount constraints)*/
    @MetaField
    private String paymentProcessingOptionDefinition;

    /*The option setting*/
    @MetaField
    private String paymentProcessingOptionSetting;

    /*Configuration setting for various payment transaction types*/
    @MetaField
    private String paymentConfiguration;

    /*Processing schedule for repeating payments for standing orders (e.g. start date, end, period, number/cycles). Note this triggers an internal execution call as necessary*/
    @MetaField
    private String paymentSchedule;

    /*Reference to the applicable mandate for direct debits*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object directDebitMandateReference;

    /*Processing settings governing direct debits*/
    @MetaField
    private String directDebitMandateSettings;

    /*Reference to the applicable mandate for bill pay transactions*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object billPayMandateReference;

    /*Processing settings governing bill pay transactions*/
    @MetaField
    private String billPayMandateSettings;

    /*The general payment transaction with all major attributes - some optional depending on type*/
    @MetaField
    private String paymentTransaction;

    /*The type of payment transaction (e.g. customer payment, standing order, direct debit, bill pay)*/
    @MetaField
    private String paymentTransactionType;

    /*Reference to the party to whom the payment is made*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object paymentTransactionPayeeReference;

    /*Reference to the account to which the payment is made*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object paymentTransactionPayeeAccountReference;

    /*Reference to the bank where the payee account is held*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object paymentTransactionPayeeBankReference;

    /*The amount (and currency if applicable) of the payment*/
    @MetaField
    private String paymentTransactionAmount;

    /*The fee type applied to the payment transaction*/
    @MetaField
    private String paymentTransactionFeeType;

    /*The fee charge applied to the transaction*/
    @MetaField
    private String paymentTransactionFeeCharge;

    /*The various key dates and times associated with the payment transaction*/
    @MetaField
    private String paymentTransactionDate;

    /*Requested payment mechanism (e.g. Wire, ACH)*/
    @MetaField
    private String paymentTransactionPaymentMechanism;

    /*Description of the purpose including any external reference to the transaction*/
    @MetaField
    private String paymentTransactionPaymentPurpose;

    /*Reference to the location the payment transaction is initiated from*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object paymentTransactionBankBranchLocationReference;

    /*The processing status of the transaction (e.g. captured, approved, initiated, confirmed, settled)*/
    @MetaField
    private String paymentTransactionStatus;

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentDefinition(String paymentDefinition) {
        this.paymentDefinition = paymentDefinition;
    }

    public String getPaymentDefinition() {
        return paymentDefinition;
    }

    public void setPaymentProcessingOptionDefinition(String paymentProcessingOptionDefinition) {
        this.paymentProcessingOptionDefinition = paymentProcessingOptionDefinition;
    }

    public String getPaymentProcessingOptionDefinition() {
        return paymentProcessingOptionDefinition;
    }

    public void setPaymentProcessingOptionSetting(String paymentProcessingOptionSetting) {
        this.paymentProcessingOptionSetting = paymentProcessingOptionSetting;
    }

    public String getPaymentProcessingOptionSetting() {
        return paymentProcessingOptionSetting;
    }

    public void setPaymentConfiguration(String paymentConfiguration) {
        this.paymentConfiguration = paymentConfiguration;
    }

    public String getPaymentConfiguration() {
        return paymentConfiguration;
    }

    public void setPaymentSchedule(String paymentSchedule) {
        this.paymentSchedule = paymentSchedule;
    }

    public String getPaymentSchedule() {
        return paymentSchedule;
    }

    public void setDirectDebitMandateReference(org.museframework.bian.classes.Object directDebitMandateReference) {
        this.directDebitMandateReference = directDebitMandateReference;
    }

    public org.museframework.bian.classes.Object getDirectDebitMandateReference() {
        return directDebitMandateReference;
    }

    public void setDirectDebitMandateSettings(String directDebitMandateSettings) {
        this.directDebitMandateSettings = directDebitMandateSettings;
    }

    public String getDirectDebitMandateSettings() {
        return directDebitMandateSettings;
    }

    public void setBillPayMandateReference(org.museframework.bian.classes.Object billPayMandateReference) {
        this.billPayMandateReference = billPayMandateReference;
    }

    public org.museframework.bian.classes.Object getBillPayMandateReference() {
        return billPayMandateReference;
    }

    public void setBillPayMandateSettings(String billPayMandateSettings) {
        this.billPayMandateSettings = billPayMandateSettings;
    }

    public String getBillPayMandateSettings() {
        return billPayMandateSettings;
    }

    public void setPaymentTransaction(String paymentTransaction) {
        this.paymentTransaction = paymentTransaction;
    }

    public String getPaymentTransaction() {
        return paymentTransaction;
    }

    public void setPaymentTransactionType(String paymentTransactionType) {
        this.paymentTransactionType = paymentTransactionType;
    }

    public String getPaymentTransactionType() {
        return paymentTransactionType;
    }

    public void setPaymentTransactionPayeeReference(org.museframework.bian.classes.Object paymentTransactionPayeeReference) {
        this.paymentTransactionPayeeReference = paymentTransactionPayeeReference;
    }

    public org.museframework.bian.classes.Object getPaymentTransactionPayeeReference() {
        return paymentTransactionPayeeReference;
    }

    public void setPaymentTransactionPayeeAccountReference(org.museframework.bian.classes.Object paymentTransactionPayeeAccountReference) {
        this.paymentTransactionPayeeAccountReference = paymentTransactionPayeeAccountReference;
    }

    public org.museframework.bian.classes.Object getPaymentTransactionPayeeAccountReference() {
        return paymentTransactionPayeeAccountReference;
    }

    public void setPaymentTransactionPayeeBankReference(org.museframework.bian.classes.Object paymentTransactionPayeeBankReference) {
        this.paymentTransactionPayeeBankReference = paymentTransactionPayeeBankReference;
    }

    public org.museframework.bian.classes.Object getPaymentTransactionPayeeBankReference() {
        return paymentTransactionPayeeBankReference;
    }

    public void setPaymentTransactionAmount(String paymentTransactionAmount) {
        this.paymentTransactionAmount = paymentTransactionAmount;
    }

    public String getPaymentTransactionAmount() {
        return paymentTransactionAmount;
    }

    public void setPaymentTransactionFeeType(String paymentTransactionFeeType) {
        this.paymentTransactionFeeType = paymentTransactionFeeType;
    }

    public String getPaymentTransactionFeeType() {
        return paymentTransactionFeeType;
    }

    public void setPaymentTransactionFeeCharge(String paymentTransactionFeeCharge) {
        this.paymentTransactionFeeCharge = paymentTransactionFeeCharge;
    }

    public String getPaymentTransactionFeeCharge() {
        return paymentTransactionFeeCharge;
    }

    public void setPaymentTransactionDate(String paymentTransactionDate) {
        this.paymentTransactionDate = paymentTransactionDate;
    }

    public String getPaymentTransactionDate() {
        return paymentTransactionDate;
    }

    public void setPaymentTransactionPaymentMechanism(String paymentTransactionPaymentMechanism) {
        this.paymentTransactionPaymentMechanism = paymentTransactionPaymentMechanism;
    }

    public String getPaymentTransactionPaymentMechanism() {
        return paymentTransactionPaymentMechanism;
    }

    public void setPaymentTransactionPaymentPurpose(String paymentTransactionPaymentPurpose) {
        this.paymentTransactionPaymentPurpose = paymentTransactionPaymentPurpose;
    }

    public String getPaymentTransactionPaymentPurpose() {
        return paymentTransactionPaymentPurpose;
    }

    public void setPaymentTransactionBankBranchLocationReference(org.museframework.bian.classes.Object paymentTransactionBankBranchLocationReference) {
        this.paymentTransactionBankBranchLocationReference = paymentTransactionBankBranchLocationReference;
    }

    public org.museframework.bian.classes.Object getPaymentTransactionBankBranchLocationReference() {
        return paymentTransactionBankBranchLocationReference;
    }

    public void setPaymentTransactionStatus(String paymentTransactionStatus) {
        this.paymentTransactionStatus = paymentTransactionStatus;
    }

    public String getPaymentTransactionStatus() {
        return paymentTransactionStatus;
    }
}