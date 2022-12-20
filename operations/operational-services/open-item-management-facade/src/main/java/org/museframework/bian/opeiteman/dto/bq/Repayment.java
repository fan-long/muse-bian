/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.opeiteman.dto.bq;

public class Repayment {
    /*Reference to the payer of the funds*/
    private org.museframework.bian.classes.Object transactionPayerReference;

    /*Reference to the source of the payment funds*/
    private org.museframework.bian.classes.Object transactionPayerProductInstanceReference;

    /*Reference to the payers account holding bank*/
    private org.museframework.bian.classes.Object transactionPayerBankReference;

    /*The type of repayment transaction (e.g. wire)*/
    private String transactionType;

    /*The amount of the repayment transaction (amount applied to the open item outstanding balance)*/
    private String transactionAmount;

    /*The currency of the payment*/
    private String transactionCurrency;

    /*Key dates associated with the transaction (e.g. value date)*/
    private String transactionDate;

    public void setTransactionPayerReference(org.museframework.bian.classes.Object transactionPayerReference) {
        this.transactionPayerReference = transactionPayerReference;
    }

    public org.museframework.bian.classes.Object getTransactionPayerReference() {
        return transactionPayerReference;
    }

    public void setTransactionPayerProductInstanceReference(org.museframework.bian.classes.Object transactionPayerProductInstanceReference) {
        this.transactionPayerProductInstanceReference = transactionPayerProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getTransactionPayerProductInstanceReference() {
        return transactionPayerProductInstanceReference;
    }

    public void setTransactionPayerBankReference(org.museframework.bian.classes.Object transactionPayerBankReference) {
        this.transactionPayerBankReference = transactionPayerBankReference;
    }

    public org.museframework.bian.classes.Object getTransactionPayerBankReference() {
        return transactionPayerBankReference;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionDate() {
        return transactionDate;
    }
}