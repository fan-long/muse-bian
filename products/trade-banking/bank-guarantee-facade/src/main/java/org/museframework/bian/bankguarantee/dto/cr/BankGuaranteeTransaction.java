/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing within Bank Guarantee. */
package org.museframework.bian.bankguarantee.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.BankGuaranteeTransaction
@MetaDto
public class BankGuaranteeTransaction {
    /*A Classification value that distinguishes between business service transaction within Bank Guarantee Transaction*/
    @MetaField
    private String bankGuaranteeTransactionParameterType;

    /*A selected optional business service as subject matter of Bank Guarantee Transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Service bankGuaranteeTransactionSelectedOption;

    /*The status of Bank Guarantee Transaction*/
    @MetaField
    private String bankGuaranteeTransactionStatus;

    /*A Classification value that specifies type of transaction for this  Bank Guarantee Transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.enumerations.Bankguaranteetransactiontypevalues bankGuaranteeTransactionType;

    /*An unique reference to an item or an occurrence of Bank Guarantee Transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankGuaranteeTransaction bankGuaranteeTransactionReference;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Document bankGuaranteeDocumentReference;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankGuaranteeAgreement bankGuaranteeAgreementReference;

    /**/
    @MetaField
    private String bankGuaranteeInvolvedPartyReference;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.enumerations.Bankguaranteeinvolvementtypevalues bankGuaranteeInvolvementType;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankGuaranteeArrangement bankGuaranteeArrangementReference;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankGuarantee bankGuaranteeFinancialInstrument;

    public void setBankGuaranteeTransactionParameterType(String bankGuaranteeTransactionParameterType) {
        this.bankGuaranteeTransactionParameterType = bankGuaranteeTransactionParameterType;
    }

    public String getBankGuaranteeTransactionParameterType() {
        return bankGuaranteeTransactionParameterType;
    }

    public void setBankGuaranteeTransactionSelectedOption(org.museframework.bian.classes.Service bankGuaranteeTransactionSelectedOption) {
        this.bankGuaranteeTransactionSelectedOption = bankGuaranteeTransactionSelectedOption;
    }

    public org.museframework.bian.classes.Service getBankGuaranteeTransactionSelectedOption() {
        return bankGuaranteeTransactionSelectedOption;
    }

    public void setBankGuaranteeTransactionStatus(String bankGuaranteeTransactionStatus) {
        this.bankGuaranteeTransactionStatus = bankGuaranteeTransactionStatus;
    }

    public String getBankGuaranteeTransactionStatus() {
        return bankGuaranteeTransactionStatus;
    }

    public void setBankGuaranteeTransactionType(org.museframework.bian.enumerations.Bankguaranteetransactiontypevalues bankGuaranteeTransactionType) {
        this.bankGuaranteeTransactionType = bankGuaranteeTransactionType;
    }

    public org.museframework.bian.enumerations.Bankguaranteetransactiontypevalues getBankGuaranteeTransactionType() {
        return bankGuaranteeTransactionType;
    }

    public void setBankGuaranteeTransactionReference(org.museframework.bian.classes.BankGuaranteeTransaction bankGuaranteeTransactionReference) {
        this.bankGuaranteeTransactionReference = bankGuaranteeTransactionReference;
    }

    public org.museframework.bian.classes.BankGuaranteeTransaction getBankGuaranteeTransactionReference() {
        return bankGuaranteeTransactionReference;
    }

    public void setBankGuaranteeDocumentReference(org.museframework.bian.classes.Document bankGuaranteeDocumentReference) {
        this.bankGuaranteeDocumentReference = bankGuaranteeDocumentReference;
    }

    public org.museframework.bian.classes.Document getBankGuaranteeDocumentReference() {
        return bankGuaranteeDocumentReference;
    }

    public void setBankGuaranteeAgreementReference(org.museframework.bian.classes.BankGuaranteeAgreement bankGuaranteeAgreementReference) {
        this.bankGuaranteeAgreementReference = bankGuaranteeAgreementReference;
    }

    public org.museframework.bian.classes.BankGuaranteeAgreement getBankGuaranteeAgreementReference() {
        return bankGuaranteeAgreementReference;
    }

    public void setBankGuaranteeInvolvedPartyReference(String bankGuaranteeInvolvedPartyReference) {
        this.bankGuaranteeInvolvedPartyReference = bankGuaranteeInvolvedPartyReference;
    }

    public String getBankGuaranteeInvolvedPartyReference() {
        return bankGuaranteeInvolvedPartyReference;
    }

    public void setBankGuaranteeInvolvementType(org.museframework.bian.enumerations.Bankguaranteeinvolvementtypevalues bankGuaranteeInvolvementType) {
        this.bankGuaranteeInvolvementType = bankGuaranteeInvolvementType;
    }

    public org.museframework.bian.enumerations.Bankguaranteeinvolvementtypevalues getBankGuaranteeInvolvementType() {
        return bankGuaranteeInvolvementType;
    }

    public void setBankGuaranteeArrangementReference(org.museframework.bian.classes.BankGuaranteeArrangement bankGuaranteeArrangementReference) {
        this.bankGuaranteeArrangementReference = bankGuaranteeArrangementReference;
    }

    public org.museframework.bian.classes.BankGuaranteeArrangement getBankGuaranteeArrangementReference() {
        return bankGuaranteeArrangementReference;
    }

    public void setBankGuaranteeFinancialInstrument(org.museframework.bian.classes.BankGuarantee bankGuaranteeFinancialInstrument) {
        this.bankGuaranteeFinancialInstrument = bankGuaranteeFinancialInstrument;
    }

    public org.museframework.bian.classes.BankGuarantee getBankGuaranteeFinancialInstrument() {
        return bankGuaranteeFinancialInstrument;
    }
}