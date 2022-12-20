/**/
package org.museframework.bian.classes;

public class TransactionLocation {
    /**/
    private String transactionLocationIdentification;

    /**/
    private String transactionLocationAddress;

    public void setTransactionLocationIdentification(String transactionLocationIdentification) {
        this.transactionLocationIdentification = transactionLocationIdentification;
    }

    public String getTransactionLocationIdentification() {
        return transactionLocationIdentification;
    }

    public void setTransactionLocationAddress(String transactionLocationAddress) {
        this.transactionLocationAddress = transactionLocationAddress;
    }

    public String getTransactionLocationAddress() {
        return transactionLocationAddress;
    }
}