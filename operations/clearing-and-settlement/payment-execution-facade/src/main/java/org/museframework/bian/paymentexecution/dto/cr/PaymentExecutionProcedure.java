/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Payment Execution. */
package org.museframework.bian.paymentexecution.dto.cr;

public class PaymentExecutionProcedure extends org.museframework.bian.classes.PaymentExecutionProcedure {
    /*Reference to the ACH financial gateway service used to execute payments*/
    private org.museframework.bian.classes.Object ACHAccessServiceSessionReference;

    /*The published gateway service availability*/
    private String ACHAccessSchedule;

    /*Reference to the SWIFT gateway service used to execute correspondent payments*/
    private org.museframework.bian.classes.Object correspondentServiceSessionReference;

    /*The published gateway service availability*/
    private String correspondentServiceAccessSchedule;

    /*Reference to the initiator of the transaction*/
    private org.museframework.bian.classes.Object paymentTransactionInitiatorReference;

    /*Reference to the payment order leading to the execution request*/
    private org.museframework.bian.classes.Object paymentOrderReference;

    /*Reference to the payer*/
    private org.museframework.bian.classes.Object payerReference;

    /*Reference to the payer's bank*/
    private org.museframework.bian.classes.Object payerBankReference;

    /*Reference to the payer's account (the source of funds)*/
    private org.museframework.bian.classes.Object payerProductInstanceReference;

    /*The target for the payment*/
    private org.museframework.bian.classes.Object payeeReference;

    /*Reference to the payee's bank*/
    private org.museframework.bian.classes.Object payeeBankReference;

    /*Reference to the payee's account (the target for the funds)*/
    private org.museframework.bian.classes.Object payeeProductInstanceReference;

    /*Key amounts included in the transaction*/
    private String amount;

    /*Currency for the amounts*/
    private String currency;

    /*Key dates associated with the transaction (e.g. order, booking, execution, value date, interest bearing)*/
    private String dateType;

    /*….*/
    private String date;

    /*Reference to any internal accounts used in processing*/
    private org.museframework.bian.classes.Object washAccountReference;

    /*Reference to any external accounts used in processing*/
    private org.museframework.bian.classes.Object intermediaryAccountReference;

    /*Requested and actual payment mechanism used*/
    private String paymentMechanismType;

    public void setACHAccessServiceSessionReference(org.museframework.bian.classes.Object ACHAccessServiceSessionReference) {
        this.ACHAccessServiceSessionReference = ACHAccessServiceSessionReference;
    }

    public org.museframework.bian.classes.Object getACHAccessServiceSessionReference() {
        return ACHAccessServiceSessionReference;
    }

    public void setACHAccessSchedule(String ACHAccessSchedule) {
        this.ACHAccessSchedule = ACHAccessSchedule;
    }

    public String getACHAccessSchedule() {
        return ACHAccessSchedule;
    }

    public void setCorrespondentServiceSessionReference(org.museframework.bian.classes.Object correspondentServiceSessionReference) {
        this.correspondentServiceSessionReference = correspondentServiceSessionReference;
    }

    public org.museframework.bian.classes.Object getCorrespondentServiceSessionReference() {
        return correspondentServiceSessionReference;
    }

    public void setCorrespondentServiceAccessSchedule(String correspondentServiceAccessSchedule) {
        this.correspondentServiceAccessSchedule = correspondentServiceAccessSchedule;
    }

    public String getCorrespondentServiceAccessSchedule() {
        return correspondentServiceAccessSchedule;
    }

    public void setPaymentTransactionInitiatorReference(org.museframework.bian.classes.Object paymentTransactionInitiatorReference) {
        this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
    }

    public org.museframework.bian.classes.Object getPaymentTransactionInitiatorReference() {
        return paymentTransactionInitiatorReference;
    }

    public void setPaymentOrderReference(org.museframework.bian.classes.Object paymentOrderReference) {
        this.paymentOrderReference = paymentOrderReference;
    }

    public org.museframework.bian.classes.Object getPaymentOrderReference() {
        return paymentOrderReference;
    }

    public void setPayerReference(org.museframework.bian.classes.Object payerReference) {
        this.payerReference = payerReference;
    }

    public org.museframework.bian.classes.Object getPayerReference() {
        return payerReference;
    }

    public void setPayerBankReference(org.museframework.bian.classes.Object payerBankReference) {
        this.payerBankReference = payerBankReference;
    }

    public org.museframework.bian.classes.Object getPayerBankReference() {
        return payerBankReference;
    }

    public void setPayerProductInstanceReference(org.museframework.bian.classes.Object payerProductInstanceReference) {
        this.payerProductInstanceReference = payerProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getPayerProductInstanceReference() {
        return payerProductInstanceReference;
    }

    public void setPayeeReference(org.museframework.bian.classes.Object payeeReference) {
        this.payeeReference = payeeReference;
    }

    public org.museframework.bian.classes.Object getPayeeReference() {
        return payeeReference;
    }

    public void setPayeeBankReference(org.museframework.bian.classes.Object payeeBankReference) {
        this.payeeBankReference = payeeBankReference;
    }

    public org.museframework.bian.classes.Object getPayeeBankReference() {
        return payeeBankReference;
    }

    public void setPayeeProductInstanceReference(org.museframework.bian.classes.Object payeeProductInstanceReference) {
        this.payeeProductInstanceReference = payeeProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getPayeeProductInstanceReference() {
        return payeeProductInstanceReference;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
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

    public void setWashAccountReference(org.museframework.bian.classes.Object washAccountReference) {
        this.washAccountReference = washAccountReference;
    }

    public org.museframework.bian.classes.Object getWashAccountReference() {
        return washAccountReference;
    }

    public void setIntermediaryAccountReference(org.museframework.bian.classes.Object intermediaryAccountReference) {
        this.intermediaryAccountReference = intermediaryAccountReference;
    }

    public org.museframework.bian.classes.Object getIntermediaryAccountReference() {
        return intermediaryAccountReference;
    }

    public void setPaymentMechanismType(String paymentMechanismType) {
        this.paymentMechanismType = paymentMechanismType;
    }

    public String getPaymentMechanismType() {
        return paymentMechanismType;
    }
}