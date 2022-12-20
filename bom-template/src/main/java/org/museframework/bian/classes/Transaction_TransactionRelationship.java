/**/
package org.museframework.bian.classes;

public class Transaction_TransactionRelationship {
    /**/
    private Transaction fromTransaction;

    /**/
    private Transaction toTransaction;

    public void setFromTransaction(Transaction fromTransaction) {
        this.fromTransaction = fromTransaction;
    }

    public Transaction getFromTransaction() {
        return fromTransaction;
    }

    public void setToTransaction(Transaction toTransaction) {
        this.toTransaction = toTransaction;
    }

    public Transaction getToTransaction() {
        return toTransaction;
    }
}