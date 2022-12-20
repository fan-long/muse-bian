/*Specified a document that is assigned to a specific transaction. */
package org.museframework.bian.classes;

public class TransactionDocument {
    /**/
    private String transactionDocumentIdentification;

    /**/
    private Location transactionDocumentLocation;

    public void setTransactionDocumentIdentification(String transactionDocumentIdentification) {
        this.transactionDocumentIdentification = transactionDocumentIdentification;
    }

    public String getTransactionDocumentIdentification() {
        return transactionDocumentIdentification;
    }

    public void setTransactionDocumentLocation(Location transactionDocumentLocation) {
        this.transactionDocumentLocation = transactionDocumentLocation;
    }

    public Location getTransactionDocumentLocation() {
        return transactionDocumentLocation;
    }
}