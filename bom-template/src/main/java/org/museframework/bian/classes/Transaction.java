/*A planned or performed action in the context of concluding or fulfilling an agreement. 

Act to do something.*/
package org.museframework.bian.classes;

public class Transaction {
    /*An identifier that allows to uniquely refer to an instance of a transaction.*/
    private String transactionIdentification;

    /*The Date that the transaction has occurred or is planned to occur.
A characteristic of transaction which refers to the LifecycleDate of transaction (e.g., initiated date, executed date, fulfillment date). */
    private String transactionDate;

    /*Specifies the category of Transaction like payment transaction, accounting transaction, financial Transaction, banking transaction, etc. */
    private org.museframework.bian.enumerations.Transactiontypevalues transactionType;

    /*A detailed explanation or commentary of transaction.*/
    private String transactionDescription;

    /*A characteristic of transaction which refers to the LifecycleStatus of transaction (e.g., initiated, executed, confirmed, cancelled, etc.) */
    private String transactionStatus;

    /*The name of transaction.*/
    private String transactionName;

    public void setTransactionIdentification(String transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }

    public String getTransactionIdentification() {
        return transactionIdentification;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionType(org.museframework.bian.enumerations.Transactiontypevalues transactionType) {
        this.transactionType = transactionType;
    }

    public org.museframework.bian.enumerations.Transactiontypevalues getTransactionType() {
        return transactionType;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public String getTransactionName() {
        return transactionName;
    }
}