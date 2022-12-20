/**/
package org.museframework.bian.consumerloan.dto.bq;

public class Withdrawal {
    /*The general payment transaction with all major attributes - some optional depending on type*/
    private String paymentTransaction;

    /*The type of payment transaction (e.g. customer payment, standing order, direct debit, bill pay)*/
    private String paymentTransactionType;

    /*Reference to the party to whom the payment is made*/
    private org.museframework.bian.classes.Object paymentTransactionPayeeReference;

    /*Reference to the account to which the payment is made*/
    private org.museframework.bian.classes.Object paymentTransactionPayeeAccountReference;

    /*Reference to the bank where the payee account is held*/
    private org.museframework.bian.classes.Object paymentTransactionPayeeBankReference;

    /*The amount (and currency if applicable) of the payment*/
    private String paymentTransactionAmount;

    /*The fee type applied to the payment transaction*/
    private String paymentTransactionFeeType;

    /*The fee charge applied to the transaction*/
    private String paymentTransactionFeeCharge;

    /*The various key dates and times associated with the payment transaction*/
    private String paymentTransactionDate;

    /*Requested payment mechanism (e.g. Wire, ACH)*/
    private String paymentTransactionPaymentMechanism;

    /*Description of the purpose including any external reference to the transaction*/
    private String paymentTransactionPaymentPurpose;

    /*Reference to the location the payment transaction is initiated from*/
    private org.museframework.bian.classes.Object paymentTransactionBankBranchLocationReference;

    /*The processing status of the transaction (e.g. captured, approved, initiated, confirmed, settled)*/
    private String paymentTransactionStatus;

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