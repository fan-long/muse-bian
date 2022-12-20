/*The role of an account in the processing of  a payment transaction

a payment transaction account is probably involved in the registration of the transaction in the books of the bank. Most probably however, other accounts will be involved too. E.g. general ledger accounts miroring movements on customer accounts*/
package org.museframework.bian.classes;

public class PaymentTransactionAccount {
    /**/
    private String paymentTransactionAccountType;

    /**/
    private String paymentTransactionAccount;

    /**/
    private String paymentTransactionAccountRole;

    public void setPaymentTransactionAccountType(String paymentTransactionAccountType) {
        this.paymentTransactionAccountType = paymentTransactionAccountType;
    }

    public String getPaymentTransactionAccountType() {
        return paymentTransactionAccountType;
    }

    public void setPaymentTransactionAccount(String paymentTransactionAccount) {
        this.paymentTransactionAccount = paymentTransactionAccount;
    }

    public String getPaymentTransactionAccount() {
        return paymentTransactionAccount;
    }

    public void setPaymentTransactionAccountRole(String paymentTransactionAccountRole) {
        this.paymentTransactionAccountRole = paymentTransactionAccountRole;
    }

    public String getPaymentTransactionAccountRole() {
        return paymentTransactionAccountRole;
    }
}