/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardcollections.dto.bq;

public class Payment {
    /*Reference to the received payment*/
    private org.museframework.bian.classes.Object paymentTransactionReference;

    /*Payment transaction details*/
    private String paymentTransaction;

    /*Processing record received for payments made against the collections account*/
    private String cardCollectionsPaymentNotificationRecord;

    public void setPaymentTransactionReference(org.museframework.bian.classes.Object paymentTransactionReference) {
        this.paymentTransactionReference = paymentTransactionReference;
    }

    public org.museframework.bian.classes.Object getPaymentTransactionReference() {
        return paymentTransactionReference;
    }

    public void setPaymentTransaction(String paymentTransaction) {
        this.paymentTransaction = paymentTransaction;
    }

    public String getPaymentTransaction() {
        return paymentTransaction;
    }

    public void setCardCollectionsPaymentNotificationRecord(String cardCollectionsPaymentNotificationRecord) {
        this.cardCollectionsPaymentNotificationRecord = cardCollectionsPaymentNotificationRecord;
    }

    public String getCardCollectionsPaymentNotificationRecord() {
        return cardCollectionsPaymentNotificationRecord;
    }
}