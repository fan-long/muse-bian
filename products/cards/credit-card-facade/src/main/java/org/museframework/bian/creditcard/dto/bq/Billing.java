/**/
package org.museframework.bian.creditcard.dto.bq;

public class Billing {
    /*Defines the set-up for the billing processing (e.g. cycle date, type of billing, etc.)*/
    private String billingParameters;

    /*The billing/invoicing transaction details*/
    private String billingTransaction;

    /*The target for the invoice, typically the card holder*/
    private String billingTransactionParty;

    /*The billing address (can vary from the customer home address)*/
    private String billingTransactionAddress;

    /*The period (from-to) covered by the invoice*/
    private String billingTransactionPeriod;

    /*Reference to an associated statement (that is included in the generated invoice)*/
    private org.museframework.bian.classes.Object billingTransactionStatementReference;

    /*The amount of the required repayment*/
    private String billingTransactionAmount;

    /*The minimum required payment (for partial payment)*/
    private String billingTransactionMinimumRequiredPayment;

    /*The due date for the payment*/
    private String billingTransactionPaymentDueDate;

    public void setBillingParameters(String billingParameters) {
        this.billingParameters = billingParameters;
    }

    public String getBillingParameters() {
        return billingParameters;
    }

    public void setBillingTransaction(String billingTransaction) {
        this.billingTransaction = billingTransaction;
    }

    public String getBillingTransaction() {
        return billingTransaction;
    }

    public void setBillingTransactionParty(String billingTransactionParty) {
        this.billingTransactionParty = billingTransactionParty;
    }

    public String getBillingTransactionParty() {
        return billingTransactionParty;
    }

    public void setBillingTransactionAddress(String billingTransactionAddress) {
        this.billingTransactionAddress = billingTransactionAddress;
    }

    public String getBillingTransactionAddress() {
        return billingTransactionAddress;
    }

    public void setBillingTransactionPeriod(String billingTransactionPeriod) {
        this.billingTransactionPeriod = billingTransactionPeriod;
    }

    public String getBillingTransactionPeriod() {
        return billingTransactionPeriod;
    }

    public void setBillingTransactionStatementReference(org.museframework.bian.classes.Object billingTransactionStatementReference) {
        this.billingTransactionStatementReference = billingTransactionStatementReference;
    }

    public org.museframework.bian.classes.Object getBillingTransactionStatementReference() {
        return billingTransactionStatementReference;
    }

    public void setBillingTransactionAmount(String billingTransactionAmount) {
        this.billingTransactionAmount = billingTransactionAmount;
    }

    public String getBillingTransactionAmount() {
        return billingTransactionAmount;
    }

    public void setBillingTransactionMinimumRequiredPayment(String billingTransactionMinimumRequiredPayment) {
        this.billingTransactionMinimumRequiredPayment = billingTransactionMinimumRequiredPayment;
    }

    public String getBillingTransactionMinimumRequiredPayment() {
        return billingTransactionMinimumRequiredPayment;
    }

    public void setBillingTransactionPaymentDueDate(String billingTransactionPaymentDueDate) {
        this.billingTransactionPaymentDueDate = billingTransactionPaymentDueDate;
    }

    public String getBillingTransactionPaymentDueDate() {
        return billingTransactionPaymentDueDate;
    }
}