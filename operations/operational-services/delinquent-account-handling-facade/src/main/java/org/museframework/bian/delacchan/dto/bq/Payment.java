/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.delacchan.dto.bq;

public class Payment {
    /*Reference to the received payment*/
    private org.museframework.bian.classes.Object paymentTransactionReference;

    /*Payment transaction details*/
    private String paymentTransaction;

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
}