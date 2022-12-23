/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Payment Order. */
package org.museframework.bian.paymentorder.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PaymentOrderProcedure {
    /*Reference to the initiator of the transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object paymentTransactionInitiatorReference;

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

    /*Requested payment mechanism (e.g. ACH, SWIFT)*/
    @MetaField
    private String paymentMechanismType;

    /*Any specific payment instructions as appropriate*/
    @MetaField
    private String paymentInstructions;

    /*Where specific involved parties may impact order confirmation (e.g. presenting, authorizing, updating, joint account holder)*/
    @MetaField
    private String interestedParties;

    /*Allows for a type of product to have specific default payment instructions*/
    @MetaField
    private String productType;

    /*Requested settlement instructions, may be overridden by execution*/
    @MetaField
    private String settlementInstructions;

    public void setPaymentTransactionInitiatorReference(org.museframework.bian.classes.Object paymentTransactionInitiatorReference) {
        this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
    }

    public org.museframework.bian.classes.Object getPaymentTransactionInitiatorReference() {
        return paymentTransactionInitiatorReference;
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

    public void setPaymentMechanismType(String paymentMechanismType) {
        this.paymentMechanismType = paymentMechanismType;
    }

    public String getPaymentMechanismType() {
        return paymentMechanismType;
    }

    public void setPaymentInstructions(String paymentInstructions) {
        this.paymentInstructions = paymentInstructions;
    }

    public String getPaymentInstructions() {
        return paymentInstructions;
    }

    public void setInterestedParties(String interestedParties) {
        this.interestedParties = interestedParties;
    }

    public String getInterestedParties() {
        return interestedParties;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    public void setSettlementInstructions(String settlementInstructions) {
        this.settlementInstructions = settlementInstructions;
    }

    public String getSettlementInstructions() {
        return settlementInstructions;
    }
}