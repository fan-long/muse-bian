/*The product features/services available with a financical facility*/
package org.museframework.bian.corbanope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class InboundPayments {
    /*Inbound payment transaction details*/
    @MetaField(0)
    private String correspondentTransactionRecord;

    /*….*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object SWIFTTransactionReference;

    /*The  primary correspondent bank*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payerBankReference;

    /*Reference to the payer*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payerReference;

    /*Intermediary correspondents if needed*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondedBankReference;

    /*Payer account reference or number*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payerProductInstanceReference;

    /*Reference to the payee*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payeeReference;

    /*Reference to the payee account as source of funds*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payeeProductInstanceReference;

    /*Refers to the payee's bank as the receiver of funds*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object payeeBankReference;

    /*Transaction specific clearing and settlement instructions*/
    @MetaField(0)
    private String specialInstructions;

    /*Key amounts of the transaction*/
    @MetaField(0)
    private String amount;

    /*Currencies of the amounts*/
    @MetaField(0)
    private String currency;

    /*Transaction dates  (e.g. order, booking, execution, value date, interest bearing)*/
    @MetaField(0)
    private String dateType;

    /*Specific date type value*/
    @MetaField(0)
    private String date;

    public void setCorrespondentTransactionRecord(String correspondentTransactionRecord) {
        this.correspondentTransactionRecord = correspondentTransactionRecord;
    }

    public String getCorrespondentTransactionRecord() {
        return correspondentTransactionRecord;
    }

    public void setSWIFTTransactionReference(org.museframework.bian.classes.Object SWIFTTransactionReference) {
        this.SWIFTTransactionReference = SWIFTTransactionReference;
    }

    public org.museframework.bian.classes.Object getSWIFTTransactionReference() {
        return SWIFTTransactionReference;
    }

    public void setPayerBankReference(org.museframework.bian.classes.Object payerBankReference) {
        this.payerBankReference = payerBankReference;
    }

    public org.museframework.bian.classes.Object getPayerBankReference() {
        return payerBankReference;
    }

    public void setPayerReference(org.museframework.bian.classes.Object payerReference) {
        this.payerReference = payerReference;
    }

    public org.museframework.bian.classes.Object getPayerReference() {
        return payerReference;
    }

    public void setCorrespondedBankReference(org.museframework.bian.classes.Object correspondedBankReference) {
        this.correspondedBankReference = correspondedBankReference;
    }

    public org.museframework.bian.classes.Object getCorrespondedBankReference() {
        return correspondedBankReference;
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

    public void setPayeeProductInstanceReference(org.museframework.bian.classes.Object payeeProductInstanceReference) {
        this.payeeProductInstanceReference = payeeProductInstanceReference;
    }

    public org.museframework.bian.classes.Object getPayeeProductInstanceReference() {
        return payeeProductInstanceReference;
    }

    public void setPayeeBankReference(org.museframework.bian.classes.Object payeeBankReference) {
        this.payeeBankReference = payeeBankReference;
    }

    public org.museframework.bian.classes.Object getPayeeBankReference() {
        return payeeBankReference;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
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
}