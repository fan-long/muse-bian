/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Payment Initiation. */
package org.museframework.bian.paymentinitiation.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PaymentInitiationTransaction {
    /*The type of payment transaction (e.g. over the counter-OTC, intra-account, overseas)*/
    @MetaField
    private String paymentTransactionType;

    /*Details of the recurring payment. Can be used to pre-populate the payment request*/
    @MetaField
    private String recurringPaymentRecord;

    /*Reference for a customer that uses recurring payments facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object recurringPaymentCustomerReference;

    /*Reference used by the customer to identify a past payment transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object recurringPaymentReference;

    /*Reference to the customer initiating the payment transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The details of the payment transaction*/
    @MetaField
    private String paymentTransaction;

    /*Reference to the payer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payerReference;

    /*Reference to the payer's bank*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payerBankReference;

    /*Reference to the payer's account (the source of funds)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payerProductInstanceReference;

    /*The target for the payment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payeeReference;

    /*Reference to the payee's bank*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payeeBankReference;

    /*Reference to the payee's account (the target for the funds)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payeeProductInstanceReference;

    /*Key amounts included in the transaction*/
    @MetaField
    private String amount;

    /*Currency for the amounts*/
    @MetaField
    private String currency;

    /*Key dates associated with the transaction (e.g. order, booking, execution, value date, interest bearing)*/
    @MetaField
    private String dateType;

    /*Value of the specific date*/
    @MetaField
    private String date;

    /*Processing and exchange fees as appropriate*/
    @MetaField
    private String paymentFeesCharges;

    /*Selection of the preferred mechanism (e.g. SWIFT, ACH, Intra account)*/
    @MetaField
    private String paymentMechanism;

    /*Details captured for reference and compliance reporting purposes*/
    @MetaField
    private String paymentPurpose;

    /*Payer identification document for OTC payment transactions*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*The copy of the identification document used*/
    @MetaField
    private String documentContent;

    public void setPaymentTransactionType(String paymentTransactionType) {
        this.paymentTransactionType = paymentTransactionType;
    }

    public String getPaymentTransactionType() {
        return paymentTransactionType;
    }

    public void setRecurringPaymentRecord(String recurringPaymentRecord) {
        this.recurringPaymentRecord = recurringPaymentRecord;
    }

    public String getRecurringPaymentRecord() {
        return recurringPaymentRecord;
    }

    public void setRecurringPaymentCustomerReference(org.museframework.bian.classes.Object recurringPaymentCustomerReference) {
        this.recurringPaymentCustomerReference = recurringPaymentCustomerReference;
    }

    public org.museframework.bian.classes.Object getRecurringPaymentCustomerReference() {
        return recurringPaymentCustomerReference;
    }

    public void setRecurringPaymentReference(org.museframework.bian.classes.Object recurringPaymentReference) {
        this.recurringPaymentReference = recurringPaymentReference;
    }

    public org.museframework.bian.classes.Object getRecurringPaymentReference() {
        return recurringPaymentReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setPaymentTransaction(String paymentTransaction) {
        this.paymentTransaction = paymentTransaction;
    }

    public String getPaymentTransaction() {
        return paymentTransaction;
    }

    public void setPayerReference(org.museframework.bian.classes.Object payerReference) {
        this.payerReference = payerReference;
    }

    public org.museframework.bian.classes.Object getPayerReference() {
        return payerReference;
    }

    public void setPayerBankReference(org.museframework.bian.classes.Object payerBankReference) {
        this.payerBankReference = payerBankReference;
    }

    public org.museframework.bian.classes.Object getPayerBankReference() {
        return payerBankReference;
    }

    public void setPayerProductInstanceReference(org.museframework.bian.classes.Object payerProductInstanceReference) {
        this.payerProductInstanceReference = payerProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getPayerProductInstanceReference() {
        return payerProductInstanceReference;
    }

    public void setPayeeReference(org.museframework.bian.classes.Object payeeReference) {
        this.payeeReference = payeeReference;
    }

    public org.museframework.bian.classes.Object getPayeeReference() {
        return payeeReference;
    }

    public void setPayeeBankReference(org.museframework.bian.classes.Object payeeBankReference) {
        this.payeeBankReference = payeeBankReference;
    }

    public org.museframework.bian.classes.Object getPayeeBankReference() {
        return payeeBankReference;
    }

    public void setPayeeProductInstanceReference(org.museframework.bian.classes.Object payeeProductInstanceReference) {
        this.payeeProductInstanceReference = payeeProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getPayeeProductInstanceReference() {
        return payeeProductInstanceReference;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setPaymentFeesCharges(String paymentFeesCharges) {
        this.paymentFeesCharges = paymentFeesCharges;
    }

    public String getPaymentFeesCharges() {
        return paymentFeesCharges;
    }

    public void setPaymentMechanism(String paymentMechanism) {
        this.paymentMechanism = paymentMechanism;
    }

    public String getPaymentMechanism() {
        return paymentMechanism;
    }

    public void setPaymentPurpose(String paymentPurpose) {
        this.paymentPurpose = paymentPurpose;
    }

    public String getPaymentPurpose() {
        return paymentPurpose;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
    }

    public String getDocumentContent() {
        return documentContent;
    }
}