/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.achoperations.dto.bq;

public class InboundACH {
    /*Reference to an inbound ACH transaction batch*/
    private org.museframework.bian.classes.Object inboundACHTransactionBatchReference;

    /*Reference to a ACH payment transaction - included in the batch*/
    private org.museframework.bian.classes.Object ACHPaymentTransactionReference;

    /*Record of key transaction fields*/
    private String ACHPaymentTransactionRecord;

    /*Reference to the originator of the payment transaction*/
    private org.museframework.bian.classes.Object paymentTransactionInitiatorReference;

    /*Reference to the source of funds in the payment*/
    private org.museframework.bian.classes.Object payerReference;

    /*Reference to the payer's bank*/
    private org.museframework.bian.classes.Object payerBankReference;

    /*Reference to the payer's account (source of funds)*/
    private org.museframework.bian.classes.Object payerProductInstanceReference;

    /*Reference to the transaction payee*/
    private org.museframework.bian.classes.Object payeeReference;

    /*Reference to the payee's account (target for funds)*/
    private org.museframework.bian.classes.Object payeeProductInstanceReference;

    /*Reference to the payee's bank*/
    private org.museframework.bian.classes.Object payeeBankReference;

    /*Transaction specific clearing and settlement instructions if appropriate*/
    private String specialInstructions;

    /*Key amounts from the transaction*/
    private String amount;

    /*Currencies of the amounts*/
    private String currency;

    /*Key date types included in the transaction (e.g. order, booking, execution, value date, interest bearing)*/
    private String dateType;

    /*Value of the date type*/
    private String date;

    public void setInboundACHTransactionBatchReference(org.museframework.bian.classes.Object inboundACHTransactionBatchReference) {
        this.inboundACHTransactionBatchReference = inboundACHTransactionBatchReference;
    }

    public org.museframework.bian.classes.Object getInboundACHTransactionBatchReference() {
        return inboundACHTransactionBatchReference;
    }

    public void setACHPaymentTransactionReference(org.museframework.bian.classes.Object ACHPaymentTransactionReference) {
        this.ACHPaymentTransactionReference = ACHPaymentTransactionReference;
    }

    public org.museframework.bian.classes.Object getACHPaymentTransactionReference() {
        return ACHPaymentTransactionReference;
    }

    public void setACHPaymentTransactionRecord(String ACHPaymentTransactionRecord) {
        this.ACHPaymentTransactionRecord = ACHPaymentTransactionRecord;
    }

    public String getACHPaymentTransactionRecord() {
        return ACHPaymentTransactionRecord;
    }

    public void setPaymentTransactionInitiatorReference(org.museframework.bian.classes.Object paymentTransactionInitiatorReference) {
        this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
    }

    public org.museframework.bian.classes.Object getPaymentTransactionInitiatorReference() {
        return paymentTransactionInitiatorReference;
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

    public void setPayeeProductInstanceReference(org.museframework.bian.classes.Object payeeProductInstanceReference) {
        this.payeeProductInstanceReference = payeeProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getPayeeProductInstanceReference() {
        return payeeProductInstanceReference;
    }

    public void setPayeeBankReference(org.museframework.bian.classes.Object payeeBankReference) {
        this.payeeBankReference = payeeBankReference;
    }

    public org.museframework.bian.classes.Object getPayeeBankReference() {
        return payeeBankReference;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
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
}