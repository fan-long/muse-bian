/*The role of an account in a transaction*/
package org.museframework.bian.classes;

public class TransactionAccountRole {
    /*The use made of an account in a transaction*/
    private String accountTransactionRole;

    /*Reference to the transaction using the account*/
    private String transactionReference;

    /*Reference to the account used in the transaction*/
    private String transactionAccountReference;

    public void setAccountTransactionRole(String accountTransactionRole) {
        this.accountTransactionRole = accountTransactionRole;
    }

    public String getAccountTransactionRole() {
        return accountTransactionRole;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionAccountReference(String transactionAccountReference) {
        this.transactionAccountReference = transactionAccountReference;
    }

    public String getTransactionAccountReference() {
        return transactionAccountReference;
    }
}